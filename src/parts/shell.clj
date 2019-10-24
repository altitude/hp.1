(ns three.parts.shell
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]))

(registry/defpart
  :shell
  (->>
   (model/cylinder 10 1)
   (model/translate [0 0 10])
   (model/hull (model/cylinder 30 5))))