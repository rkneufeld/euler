(require '[clojure.string :as s])

(defn palindrome? [num]
  (let [numstr (.toString num),
        revstr (s/reverse numstr)]
    (= numstr revstr)))

(def triple-digit-products (lazy-seq (for [x (range 100 1000)
                                           y (range 100 1000)]
                                       (* x y))))

(defn answer []
  (let [palindromes (filter palindrome? triple-digit-products)]
    (apply max palindromes)))
