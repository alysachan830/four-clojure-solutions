(ns four-clojure-solutions.27)

;Write a function which returns true if the given sequence is a palindrome. Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

; My solution
(fn palindrome [x]
  (def t (vec (seq x)))
  (if (< (count t) 3) false)
  (loop [l t]
    (if (= (count l) 1)
      true
      (if (= (first l) (last l))
        (recur (subvec l 1 (- (count l) 1)))
        false))))