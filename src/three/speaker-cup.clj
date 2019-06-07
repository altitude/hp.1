(ns three.speaker-cup
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

(def speaker-radius 26)
(def speaker-height 8)
(def res 256)

(defn circleify
  [object radius count]
  (let
    [points (range count)
     angle (/ (* 2 Math/PI) count)]
    (map
      (fn [i]
        (->>
          object
          (translate [0 radius 0])
          (rotate (* i angle) [0 0 1]))) points)))

(defn ring
  [radius height]
  (difference
    (cylinder (+ 3 radius) height)
    (cylinder radius (+ 2 height))))

(defn holes
  [radius]
  (let
    [hole-radius (/ radius 13)
     height 10
     holes-count 6]
     (union
      (circleify (cylinder hole-radius height) (/ radius 4) holes-count)
      (->>
        (circleify (cylinder hole-radius height) (/ radius 2) holes-count)
        (rotate [0 0 (/ Math/PI 2)]))
      (circleify (cylinder (- hole-radius 0.5) height) (/ radius 2) holes-count))))

(def grid
  (with-fn res
    (difference
      (cylinder (* 1.5 speaker-radius) 1)
      (holes speaker-radius)
      (circleify
        (cylinder 1.5 5)
        (+ (/ speaker-radius 3.2) speaker-radius) 6))))

(def speaker-holder
  (let [
     rim-width 2
     rim-height 2
     rim-radius (- speaker-radius rim-width)
     mylar-free-height 3
     upper-height (+ speaker-height rim-height)
     height (+ upper-height mylar-free-height)
     rim-z (+ (- (/ rim-height 2) (/ upper-height 2)) (/ mylar-free-height 2))]
    (println height)
    (with-fn res
      (difference
        (union
          (ring speaker-radius height)
          (->>
            (ring rim-radius rim-height)
            (translate [0 0 rim-z])))
        (->>
          (cube 10 20 10)
          (translate [speaker-radius 0 6])
          (color [1 0 0]))))))

(def speaker-clip
  (->>
    (circleify
      (->>
        (cube 5 8 5)
        (translate [0 2.5 5])
        (color [0 0 1]))
      speaker-radius 5)
    (rotate [0 0 (/ Math/PI 10)])))

(def speaker-cup
  (->>
    (difference
      (union
        speaker-holder
        (->>
          grid
          (translate [0 0 -6])))
      speaker-clip)
    (rotate [0 0 0])))

(def speaker-cup
  (->>
    (difference
      (union
        ; speaker-holder
        (->>
          grid
          (translate [0 0 -6])))
      speaker-clip)
    (rotate [0 0 0])))

(def primitives
  [speaker-cup speaker-clip])

(spit "three.scad"
  (write-scad primitives))
