(ns four-clojure-solutions.25)

;Write a function which returns only the odd numbers from a sequence.
;
;(= (__ #{1 2 3 4 5}) '(1 3 5))
;(= (__ [4 2 1 6]) '(1))
;(= (__ [2 2 4 6]) '())
;(= (__ [1 1 1 3]) '(1 1 1 3))

;My solution 1
#(filter odd? %)

;My solution 2
(fn [c]
  (loop [r () coll c]
    (if (empty? coll)
      (reverse r)
      (if (odd? (first coll))
        (recur (conj r (first coll)) (rest coll))
        (recur r (rest coll))
        ))))