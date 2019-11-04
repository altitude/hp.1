(ns three.parts.registry
  (:require [scad-clj.scad :as scad]
            [scad-clj.model :as model]))

(def parts (atom {}))

(defn write
  ([]
  (spit "three.scad"
        (scad/write-scad (vals @parts))))
  ([part]
  (spit "three.scad"
        (scad/write-scad (get @parts part)))))

(defn defpart
  [name value]
  (do
    (swap! parts assoc name value)
    (write)))

(defn reset
  []
  (swap! parts empty)
  (write))