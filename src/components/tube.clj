(ns three.components.tube
  (:use scad-clj.model))

(defn inner-tube
  [radius height thickness]
  (let
   [outer-radius (+ radius thickness)]
    (difference
     (cylinder outer-radius height)
     (cylinder radius (+ 2 height)))))