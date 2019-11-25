(ns three.parts.class
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.circleify :refer (circleify)]))

(registry/defpart
  :glass
  (->>
   (model/difference
    (->>
     (model/cylinder 25.3 2)
     (model/with-fn 128))
    (->>
     (model/cylinder 1.5 100)
     (model/with-fn 128)
     (circleify 8 6)))
   (model/color [1 1 1 0.2])
   (model/scale [2 2 1])
   (model/translate [0 0 15.7])
   (model/project)))