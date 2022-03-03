(ns four-clojure-solutions.26)
; Still solving..
;(defn getf [x]
;  (loop [start 0 sum 0 r ()]
;    (if (== x start)
;      r
;      (if (< (count r) 2)
;        (recur (inc start) (+ start sum) (conj r start))
;        (recur (inc start) (+ sum (first r)) (conj r (+ sum (first r))))
;        ))
;    ))