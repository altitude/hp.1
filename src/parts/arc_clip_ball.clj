(ns three.parts.arc-clip-ball
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.symmetry :as symmetry]))

(registry/defpart
  :arc-ball
  (->>
   (model/difference
    (->>
     (model/sphere 9)
     (model/with-fn 64))
    (->>
     (model/cube 100 100 100)
     (model/translate [0 0 -50]))
    (->>
     (model/cube 100 2 4)
     (model/translate [0 3 3.5])
     (symmetry/symmetry :y)))
   (model/translate [0 0 18])
   (model/color [1 0 0])))