(ns three.geometry.symmetry
  (:require [scad-clj.model :as model]))

(defn symmetry
  [axis object]
  (let [scale (case axis
                :x [-1 1 1]
                :y [1 -1 1]
                :z [1 1 -1]
                [1 1 1])]
    (model/union
     object
     (model/scale scale object))))
