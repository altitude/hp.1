(ns three.tools.arc-clamp
  (:require [scad-clj.model :as model]
            [three.parts.registry :refer (defpart)]
            [three.geometry.torus :refer (torus)]
            [three.geometry.slicethrough :refer (slicethrough)]))

(defn- clamp-jaw
  [width height depth clamp-height clamp-width]
  (model/difference
   (model/cube width depth height)
   (->>
    (model/cube clamp-width clamp-height (+ 1 height))
    (model/translate [0 (- (/ depth 2)) 0]))))

(defpart
  :arc-clamp
  (let [radius 200
        inner-radius 180
        height 20
        tool-height (* 2 (- radius inner-radius))
        tool-width 60
        clamp-width 20
        clamp-height 10
        clamp-jaw-height (* 2 clamp-height)
        wire (->>
              (torus 2 inner-radius)
              (model/with-fn 64))
        inner-ring (model/difference
                    (->>
                     (model/cylinder inner-radius (+ 0 height))
                     (model/with-fa 0.5))
                    wire)
        outer-ring (model/difference
                    (->>
                     (model/cylinder radius height)
                     (model/with-fa 1))
                    inner-ring
                    wire)]
    (->>
      (model/union
       (model/intersection
        (->>
         (model/cube tool-width tool-height (+ 2 height))
         (model/translate [0 inner-radius 0]))
        inner-ring)
      ; clamp jaw 
      ;  (->>
      ;   (model/difference
      ;    (model/cube tool-width clamp-jaw-height height)
      ;    (->>
      ;     (model/cube clamp-width clamp-height (+ 1 height))
      ;     (model/translate [0 (- (/ clamp-jaw-height 2)) 0])))
       (->>
        (clamp-jaw
         tool-width
         clamp-jaw-height
         height
         clamp-height
         clamp-width)
         (model/translate [0
                           (+
                            (- inner-radius tool-height)
                            clamp-jaw-height 1)
                           0]))))))