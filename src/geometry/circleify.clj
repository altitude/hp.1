(ns three.geometry.circleify
  (:require [scad-clj.model :as model]))

(defn circleify
  [radius count object]
  (let
   [points (range count)
    angle (/ (* 2 Math/PI) count)]
    (map
     (fn [i]
       (->>
        object
        (model/translate [0 radius 0])
        (model/rotate (* i angle) [0 0 1]))) points)))