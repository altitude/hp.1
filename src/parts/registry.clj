(ns three.parts.registry
  (:require [scad-clj.scad :as scad]))

(def parts (atom {}))

(defn defpart
  [name value]
  (do
    (swap! parts assoc name value)
    (write)))

(defn write
  []
  (spit "three.scad"
        (scad/write-scad (vals @parts))))