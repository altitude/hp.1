(ns three.core
  (:use [scad-clj.scad])
  (:use [scad-clj.model])
  (:use [three.parts.arc-clip])
  (:use [three.parts.cup]))

(let
 [clip (arc-clip)
  parts (cup)]
  (spit "three.scad"
        (write-scad parts)))