(ns two-fer)


(defn two-fer
  ([] "One for you, one for me.")
  ([name] (str "One for " name ", one for me.")))


(comment
  (two-fer)
  (two-fer "Alice")
  (two-fer "Bob")

  )
