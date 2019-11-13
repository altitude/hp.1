(ns three.geometry.torus
  (:require [scad-clj.model :as model]))

(defn torus
  [r1 r2]
  (->>
   (model/circle r1)
   (model/translate [r2 r1 0])
   (model/extrude-rotate)
   (model/translate [0 0 (- r1)])))