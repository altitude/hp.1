(ns three.geometry.symmetry
  (:require [scad-clj.model :as model]))

(defn symmetry
  [axis object]
  (when
   (= :x axis)
    (model/union
     object
     (model/scale [-1 1 1] object))))
