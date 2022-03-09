(ns four-clojure-solutions.26)

;Write a function which returns the first X fibonacci numbers.
;
;(= (__ 3) '(1 1 2))
;(= (__ 6) '(1 1 2 3 5 8))
;(= (__ 8) '(1 1 2 3 5 8 13 21))

; =================================================

; My solution
; Logic:
; The number to be added in the list equals to
; the sum of the first 2 numbers in the list in the previous loop

; recur does 2 things:
; - save the sum for the next loop
; - conj the list with the sum saved from the previous loop

; Example: print first 4 fibonacci numbers

; After 1st loop (by default we add 0 if the list is empty initially, by using "or"):
; 1 1 (1)
;   ^
; After 2nd loop:
; 2 2 (1 1)
;   ^  ^
; After 3rd loop:
; 3 3 (2 1 1)
;   ^  ^
; After 4th loop:
; 4 5 (3 2 1 1)
;   ^  ^
; reverse (3 2 1 1)
; return (1 1 2 3)

(fn [x]
  (loop [start 0 sum 1 r ()]
    (if (== x start)
      (reverse r)
      (recur (inc start) (+ sum (or (first r) 0)) (conj r sum))
      )
    ))

; Other solution 1
; It has the same logic mentioned above
;(fn [n]
;  (loop [col [] oldSum 1 sum 1 t 0]
;  (if (== t n)
;    col
;    (recur (conj col oldSum) sum (+ oldSum sum) (inc t))
;    ))
;  )


; Other solution 2
; Still studying...
;#(take %
;       (map first
;            (iterate (fn [[a b]] [b (+ a b)]) [1 1])))