(ns four-clojure-solutions.21)

;Write a function which returns the Nth element from a sequence.

;Question
;(= (__ '(4 5 6 7) 2) 6)
;(= (__ [:a :b :c] 0) :a)
;(= (__ [1 2 3 4] 1) 2)
;(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;My solution
#(last (take (+ 1 %2) %1))

;Other
(defn get-item [n s]
  (loop [count n set s]
    (if (= count 0)
      (first set)
      (recur (dec count) (rest set))
      )
    )
  )

(println(get-item 1 [1 2 3 4]))
