(ns three.components.tube
  (:require [scad-clj.model :as model]))

(defn inner-tube
  [radius height thickness]
  (let
   [outer-radius (+ radius thickness)]
    (model/difference
     (model/cylinder outer-radius height)
     (model/cylinder radius (+ 2 height)))))

(defn outer-tube
  [radius height thickness]
  (inner-tube (- radius thickness) height thickness))