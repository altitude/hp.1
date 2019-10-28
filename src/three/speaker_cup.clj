(ns three.speaker-cup
  (:require [scad-clj.model :as model]
            [three.geometry.circleify :as circleify]
            [three.parts.registry :as registry]))

(def speaker-radius 26)
(def speaker-height 8)
(def res 256)

(defn ring
  [radius thickness height]
  (model/difference
    (model/cylinder (+ thickness radius) height)
    (model/cylinder radius (+ 2 height))))

(defn holes
  [radius]
  (let
    [hole-radius (/ radius 13)
     height 10
     holes-count 6]
     (model/union
      (circleify/circleify
       (/ radius 4)
       holes-count
       (model/cylinder hole-radius height))
      (->>
        (circleify/circleify
         (/ radius 2)
         holes-count
         (model/cylinder hole-radius height))
        (model/rotate [0 0 (/ Math/PI 2)]))
      (circleify/circleify
       (/ radius 2)
       holes-count
       (model/cylinder (- hole-radius 0.5) height)))))

(def grid
  (model/with-fn res
    (model/difference
      (model/cylinder (* 1.5 speaker-radius) 1)
      (holes speaker-radius)
      (circleify/circleify
       (+ (/ speaker-radius 3.2) speaker-radius)
       6
       (model/cylinder 1.5 5)))))

(defn speaker-holder
  []
  (let [
        rim-width 2
        rim-height 2
        rim-radius (- speaker-radius rim-width)
        mylar-free-height 3
        upper-height (+ speaker-height rim-height)
        height (+ upper-height mylar-free-height)
        rim-z (+ (- (/ rim-height 2) (/ upper-height 2)) (/ mylar-free-height 2))]
    (model/with-fn res
      (model/difference
       (model/union
        (ring speaker-radius 3 height)
        (->>
         (ring rim-radius 3 rim-height)
         (model/translate [0 0 rim-z])))
       (->>
        (model/cube 10 20 10)
        (model/translate [speaker-radius 0 6])
        (model/color [1 0 0]))))))

(def speaker-clip
  (->>
    (circleify/circleify
     speaker-radius
     5
     (->>
      (model/cube 5 8 5)
      (model/translate [0 2.5 5])
      (model/color [0 0 1])))
    (model/rotate [0 0 (/ Math/PI 10)])))

(registry/defpart
  :speaker-cup
  (->>
   (model/difference
    (model/union
     (speaker-holder)
     (->>
      grid
      (model/translate [0 0 -6])))
    speaker-clip)
   (model/rotate [0 0 0])
   (model/color [0.1 0.1 0.1])))