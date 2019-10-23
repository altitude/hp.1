(ns three.geometry.symmetry
  (:use scad-clj.model))

(defn symmetry
  [axis object]
  (when
   (= :x axis)
    (union
     object
     (scale [-1 1 1] object))))