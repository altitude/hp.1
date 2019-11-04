(ns three.parts.ports
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]))

(registry/defpart
  :ports
  (model/cube 10 20 10))