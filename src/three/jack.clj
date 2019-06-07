(ns three.jack
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

(def res 32)

(def jack-body (let
  [h 160]
  (translate
    [0 0 (- (/ h 2))]
    (with-fn res
      (cylinder 35 h)))))

(def jack-top (let
  [h 15]
  (translate
    [0, 0, (/ h 2)]
    (with-fn res (cylinder [35 15] h)))))

(def jack-base (let
  [h 12
   d 45]
  (translate
    [0 0 (- (- (/ h 2)) 160)]
    (cylinder d h))))

(def jack [
  jack-top
  jack-body
  jack-base])

(def connector
  (difference
    (cylinder 50 200)
    jack))

(def primitives [connector])
