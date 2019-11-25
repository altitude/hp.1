(ns three.parts.arc-clip-ball
  (:require [scad-clj.model :as model]
            [three.parts.registry :as registry]
            [three.geometry.symmetry :as symmetry]
            [three.geometry.slicethrough :refer (slicethrough)]
            [three.geometry.circleify :refer (circleify)]))

(registry/defpart
  :arc-ball
  (->>
   (model/difference
    (->>
     (model/sphere 12)
     (slicethrough :z)
     (model/with-fn 128))
    (->>
     (->>
      (model/cylinder 1 100)
      (model/with-fn 64)
      (model/translate [-1.5 0 0])
      (symmetry/symmetry :x)
      (model/hull)
      (model/rotate [0 (/ Math/PI 2) 0]))
     (model/translate [0 3 5])
     (symmetry/symmetry :y)))
   (model/translate [0 0 18])
   (model/color [0.1 0.1 0.1])))

(registry/defpart
  :arc-ball-clips
  (->>
   (model/union
    (->>
     (model/cylinder 2 1)
     (model/with-fn 64))
    (->>
     (model/cylinder 1.4 3)
     (model/with-fn 64)
     (model/translate [0 0 2])))
   (circleify 8 6)
   (model/translate [0 0 15])
   (model/color [0.1 0.1 0.1])))