(ns three.geometry.bias-cut
  (:require [scad-clj.model :as model]
            [three.geometry.symmetry :refer (symmetry)]))

(defn bias-cut
  [height angle object]
  (let [slicers (->>
                 (model/cube height 100 100)
                 (model/translate [0 0 5])
                 (symmetry :z)
                 (model/rotate [0 angle 0]))]
    (->>
     (model/intersection
      object
      (model/hull slicers)))))