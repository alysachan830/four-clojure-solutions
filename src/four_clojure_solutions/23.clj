(ns four-clojure-solutions.23)
;Write a function which reverses a sequence.
;Special Restrictions : reverse

;(= (__ [1 2 3 4 5]) [5 4 3 2 1])
;(= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;My solution 1
; For list, item can only be added starting from the head (list sequential linked list)
; see https://clojure.org/guides/learn/sequential_colls#_lists
; Hence, when items are conjuncted one at a time,
; the item is put at the head of the list
#(into () %)

;My solution 2
(fn[c]
  (loop [r () coll c]
    (if (empty? coll)
      r
      (recur (conj r (first coll)) (rest coll))))
  )
