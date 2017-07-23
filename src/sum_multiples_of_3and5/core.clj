(ns sum-multiples-of-3and5.core
  (:gen-class))

 (defn multipleof? [of number]
   (zero? (mod number of))
  )

  (defn sum-multiples-of-3or5 [underNumber]
    (reduce + (for [i (range underNumber)
               :when (or (multipleof? 3 i) (multipleof? 5 i))] i)))

(defn -main
  [& args]
  (prn (str "The sum of multiples of 3 or 5 under 1000 is: "
  (sum-multiples-of-3or5 1000))))
