(ns four-clojure-solutions.22)
;Write a function which returns the total number of elements in a sequence.
;Special Restrictions : count

;(println(= (__ '(1 2 3 3 1)) 5))
;(= (__ "Hello World") 11)
;(= (__ [[1 2] [3 4] [5 6]]) 3)
;(= (__ '(13)) 1)
;(= (__ '(:a :b :c)) 3)


;My solution: v1
;(fn [s]
;  (loop [count 0 sq s]
;    (if (empty? (rest sq))
;      (inc count)
;      (recur (inc count) (rest sq)))
;    )
;  )

;My solution: v2
(fn [s]
  (loop [count 0 sq s]
    (if (empty? sq)
      count
      (recur (inc count) (rest sq)))
    )
  )

;Other solutions
;Increment 1 by starting with 0. But do nothing with the sequence
;reduce (fn [l r] (+ l 1)) 0