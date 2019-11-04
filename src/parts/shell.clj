(ns three.parts.shell
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.circleify :as circleify]
            [three.geometry.slicethrough :refer (slicethrough)]))

(registry/defpart
  :shell
  (let [radius 39
        shell (->>
              ;  (model/cylinder (- radius 9) 1)
              ;  (model/translate [0 0 13])
               (model/sphere 6)
               (model/with-fn 64)
               (model/translate [0 0 13])
               (circleify/circleify (- radius 9) 6)
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
           (model/translate [0 0 -1])
           (model/color [0 0 1 0.6]))))
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
         (model/translate [0 0 -2])))
       (->>
        (model/cylinder 2.5 10)
        (model/with-fn 64)
        (model/rotate [0 (/ Math/PI 2) 0])
        (model/translate [36 0 6]))))
     (model/translate [0 0 3])
     (slicethrough)
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