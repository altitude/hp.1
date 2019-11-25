(ns three.parts.shell
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.circleify :as circleify]
            [three.geometry.slicethrough :refer (slicethrough)]
            [three.geometry.torus :refer (torus)]
            [three.components.tube :as tube]
            [three.geometry.bias-cut :refer (bias-cut)]))

(registry/defpart
  :shell
  (let [radius 39
        shell (->>
              ;  (model/cylinder (- radius 9) 1)
              ;  (model/translate [0 0 13])
              ;  
              ;  (model/sphere 6)
              ;  (model/with-fn 64)
              ;  (model/translate [0 0 13])
              ;  (circleify/circleify (- radius 9) 6)
              ; 
               (torus 15 22) 
               (model/with-fn 128)
               (slicethrough :z)
               (model/hull
                (->>
                 (model/cylinder radius 1)
                 (model/with-fn 128))))]
    (->>
     (model/difference
      (model/difference
       (model/union
         ;  outer shell
        (->>
         (model/difference
          shell
          (->>
           shell
           (model/scale [0.95 0.95 0.95])
           (model/translate [0 0 -1]))
          (->>
           (model/cylinder 24 100)
           (model/with-fn 128))
          (->>
           (model/cylinder 25.5 2)
           (model/with-fn 128)
           (model/translate [0 0 12.7]))))
         ;  attach ring
        (->>
         (model/difference
          (->>
           (model/cylinder radius 3)
           (model/with-fn 128))
          (->>
           (model/cylinder 29.5 4)
           (model/with-fn 128))
          (->>
           (model/cylinder 1.5 4)
           (circleify/circleify 33 6)
           (model/with-fn 16)))
         (model/translate [0 0 -2]))
        ; glass mount
        ; (->>
        ;  (model/cylinder 3 2)
        ;  (model/with-fn 64)
        ;  (circleify/circleify 25 12)
        ;  (model/translate [0 0 11.5]))
        )
      ;  jack hole
       (->>
        (model/cylinder 2.6 200)
        (model/with-fn 64)
        (model/rotate [0 (/ Math/PI 2) 0])
        (model/translate [0 0 6]))))
     (model/translate [0 0 3])
     (slicethrough :y)
     (model/color [1 1 1]))))

(registry/defpart
  :main-screws
  (->>
   (model/cylinder 1.5 40)
   (circleify/circleify 33 6)
   (model/with-fn 32)
   (model/color [1 0 0])))

(registry/defpart
  :arc-clip-attachment
  (->>
   (model/cylinder 10 4)
   (model/translate [0 0 17])))

(registry/defpart
  :jack-hole-joint
  (->>
   (model/union
    (->>
     (tube/outer-tube 2.6 100 0.5)
     (model/with-fn 128)
     (bias-cut 1 (/ Math/PI 3)))
    (->>
     (tube/inner-tube 2.6 100 0.5)
     (model/with-fn 128)
     (bias-cut 1 (/ Math/PI 3.1))
     (model/translate [0 0 -0.5])))
   (model/rotate [0 (/ Math/PI 2) 0])
   (model/translate [33 0 9])))

(registry/defpart
  :wire-hole-joint
  (->>
   (model/union
    (->>
     (tube/outer-tube 2.6 100 1.5)
     (model/with-fn 128)
     (bias-cut 3.5 (/ Math/PI 3))
     (model/translate [0 0 1]))
    (->>
     (tube/inner-tube 2.6 100 0.5)
     (model/with-fn 128)
     (bias-cut 1 (/ Math/PI 3.1))
     (model/translate [0 0 -0.5])))
   (model/rotate [0 (/ Math/PI 2) 0])
   (model/translate [33 0 9])
   (model/scale [-1 1 1])))

; (registry/defpart
;   :test-torus
;   (->>
;    (model/circle 10)
;    (model/translate [30 10 0])
;    (model/extrude-rotate)
;    (model/hull)
;    (model/translate [0 0 -10])
;    (slicethrough :z)))