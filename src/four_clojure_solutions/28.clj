(ns four-clojure-solutions.28)

;; My solution
#(->> (reduce (fn [init v]
                (loop [item v
                       ts '()
                       s init]
                  (cond (coll? item)
                        (recur (first item)
                               (concat ts (rest item))
                               s)
                        (not-empty ts)
                        (recur (first ts)
                               (rest ts)
                               (conj s item))
                        :else (conj s item)))) '() %)
      (reverse))