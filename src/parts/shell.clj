(ns three.parts.shell
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.circleify :as circleify]))

(registry/defpart
  :shell
  (let [radius 39
        shell (->>
               (model/cylinder 30 1)
               (model/translate [0 0 13])
               (model/hull (model/cylinder radius 1)))]
    (->>
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
         (model/cylinder radius 3)
         (->>
          (model/cylinder 29.5 4)
          (model/with-fn 64))
         (->>
          (model/cylinder 1.5 4)
          (circleify/circleify 33 6)
          (model/with-fn 16)))
        (model/translate [0 0 -2])))
      ; slice
      (->>
       (model/cube 100 100 100)
       (model/translate [50 0 0])))
     (model/translate [0 0 3])
     (model/color [0.1 0.1 0.1]))))

(registry/defpart
  :main-screws
  (->>
   (model/cylinder 1.5 40)
   (circleify/circleify 33 6)
   (model/with-fn 32)
   (model/color [1 0 0])))