(ns three.parts.cushion-ring
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.components.tube :as tube]
            [three.geometry.circleify :refer (circleify)]))

(registry/defpart
  :cushion-ring
  (->>
   (model/difference
    (->>
     (tube/outer-tube 37.5 2 9)
     (model/with-fn 128))
    (->>
     (model/cylinder 1.5 4)
     (circleify 33 6)
     (model/with-fn 128)))
   (model/scale [2 2 1])
   (model/translate [0 0 -10])
   (model/project)))