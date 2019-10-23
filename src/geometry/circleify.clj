(ns three.geometry.circleify
  (:use scad-clj.model))

(defn circleify
  [radius count object]
  (let
   [points (range count)
    angle (/ (* 2 Math/PI) count)]
    (map
     (fn [i]
       (->>
        object
        (translate [0 radius 0])
        (rotate (* i angle) [0 0 1]))) points)))