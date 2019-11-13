(ns three.geometry.slicethrough
  (:require [scad-clj.model :as model]))

(defn slicethrough
  ([part]
  (slicethrough :x part))
  ([axis part]
   (let [size 1000
         unit (- (/ size 2))
         translation (case axis
                       :x [unit 0 0]
                       :y [0 unit 0]
                       :z [0 0 unit])]
     (model/difference
      part
      (->>
        (model/cube size size size)
        (model/translate translation))))))