(defn walk
  [tree]
  (let [dfs (fn dfs [node]
              (lazy-seq
                (cons (first node)
                      (when (rest node)
                        (mapcat dfs (rest node))))))]
    (dfs tree)))

(def result
  (walk '(A (B (D) (E)) (C (F)))))

(println result)

