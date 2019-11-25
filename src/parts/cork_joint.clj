(ns three.parts.cork-joint
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]))

(registry/defpart
  :cork-joint
  (let [height 5]
    (->>
     (model/difference
      (model/cylinder 39 height)
      (model/cylinder 30 (+ 2 height)))
    ;  (model/translate [0 0 -2.99])
     (model/color [0.3 0.2 0.09])
     (model/with-fn 128)
     (model/project))))