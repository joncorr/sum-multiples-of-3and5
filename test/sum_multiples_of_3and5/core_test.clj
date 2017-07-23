(ns sum-multiples-of-3and5.core-test
  (:require [clojure.test :refer :all]
            [sum-multiples-of-3and5.core :refer :all]))

(deftest test-multipleof?-10and5-true
  (is (= true (multipleof? 5 10))))

(deftest sum-multiples-of-3or5-233168
  (is (= (sum-multiples-of-3or5 1000) 233168)))

;(run-tests 'sum-multiples-of-3and5.core-test)
