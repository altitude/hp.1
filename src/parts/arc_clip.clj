(ns three.parts.arc-clip
  (:require [scad-clj.model :as model]
            [three.components.tube :as tube]
            [three.geometry.symmetry :as symmetry]
            [three.parts.registry :as registry]))

(defn
  arc-clip-ball
  []
  (->>
   (model/union
    (->>
     (model/sphere 3)
     (model/with-fn 64))
    (->>
     (model/cylinder 2 15)
     (model/with-fn 64)
     (model/rotate [(/ Math/PI 2) 0 0])
     (model/translate [0 -7 0])))
   (model/translate [0 2 0.5])))

(registry/defpart
  :arc-clip-ball
  (arc-clip-ball))

(registry/defpart
  :arc-clip
  (let [height 10
        tube-height (+ 4 height)
        tube (->>
              (tube/inner-tube 1 tube-height 2)
              (model/with-fn 64)
              (model/rotate [0 (/ Math/PI 30) 0])
              (model/translate [9 0 0]))]
    (->>
     (model/union
      tube
      (model/difference
       (->>
        (model/cube 8 4 height)
        (model/translate [3 0 0.7]))
       (model/hull tube)
       (arc-clip-ball)))
     (model/rotate [(/ Math/PI 2) 0 0])
     (model/translate [0 0 20])
     (model/color [1 0 0 0.6])
     (symmetry/symmetry :x))))