(ns three.parts.pcb
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.slicethrough :refer (slicethrough)]))

(registry/defpart
  :pcb
  (->>
   (model/cylinder 20 1.6)
   (slicethrough :y)
   (model/translate [0 0 10])
   (model/color [1 1 1])))