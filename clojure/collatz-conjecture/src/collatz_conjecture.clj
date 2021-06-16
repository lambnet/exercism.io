(ns collatz-conjecture)

(defn collatz [num]
  (cond
    (== num 1) (- num 1)
    (even? num) (+ 1 (collatz (/ num 2)))
    :else (+ 1 (collatz (+ (* 3 num) 1)))))


(comment
  (collatz 16)
  (juxt count (collatz 21))
  )

