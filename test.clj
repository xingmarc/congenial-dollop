(print
  (flatten [[1 2 3] [4 5 6] [7 8 9]]))

(def words ["the" "quick" "brown" "fox" "jumped" "over" "the" "lazy" "dog"])
(print
  (filter #(= 3 (count %)) words))
(print
  (map #(count %) words))
