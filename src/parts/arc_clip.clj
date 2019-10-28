(ns three.parts.arc-clip
  (:require [scad-clj.model :as model]
            [three.components.tube :as tube]
            [three.geometry.symmetry :as symmetry]
            [three.parts.registry :as registry]))

(registry/defpart
  :arc-clip
  (let [tube (->>
              (tube/inner-tube 15 100 8)
              (model/rotate [0 (/ Math/PI 9) 0])
              (model/translate [60 0 0]))]
    (->>
     (model/union
      tube
      (model/difference
       (->>
        (model/cube 80 20 80)
        (model/translate [30 0 7]))
       (model/hull tube)))
     (symmetry/symmetry :x))))
