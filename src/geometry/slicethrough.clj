(ns three.geometry.slicethrough
  (:require [scad-clj.model :as model]))

(defn slicethrough
  [part]
  (model/difference
   part
   (->>
    (model/cube 1000 1000 1000)
    (model/translate [500 0 0]))))