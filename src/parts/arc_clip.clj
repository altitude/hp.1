(ns three.parts.arc-clip
  (:use [scad-clj.model])
  (:use [three.components.tube])
  (:use [three.geometry.symmetry]))

(defn arc-clip []
  (let [tube (->>
              (inner-tube 15 100 8)
              (rotate [0 (/ Math/PI 9) 0])
              (translate [60 0 0]))]
    (->>
     (union
      tube
      (difference
       (->>
        (cube 80 20 80)
        (translate [30 0 7]))
       (hull tube)))
     (symmetry :x))))