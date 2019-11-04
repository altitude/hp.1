(ns three.components.ring
  (:require [scad-clj.model :as model]))

(defn ring
  [radius angle thickness height]
  (->>
   (model/extrude-rotate
    {:angle angle}
    (->>
     (model/square thickness height)
     (model/translate [radius 0 0])))
   (model/with-fn 64)))