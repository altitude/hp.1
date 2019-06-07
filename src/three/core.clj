(ns three.core
  (:require [three.jack :as jack]))

(spit "three.scad"
  (write-scad jack/primitives))
