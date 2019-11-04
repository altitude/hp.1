(ns three.parts.pcb
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]))

(registry/defpart
  :pcb
  (->>
   (model/cylinder 20 1.6)
   (model/translate [0 0 10])
   (model/color [0.1 0.4 0])))