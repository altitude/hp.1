(ns three.parts.cup
  (:use scad-clj.model))

(defn cup
  []
  (->>
   (cylinder 10 1)
   (translate [0 0 10])
   (hull (cylinder 30 5))))