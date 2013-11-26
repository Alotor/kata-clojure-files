(ns file.main
  (:require
    [file.services :as services]))

(defn remove-duplicated [dir]
  (let [files (services/get-files dir)
        sortedFiles (sort-by :size < files)]
    (loop [current (first sortedFiles) pending (rest sortedFiles)]
      (let [head (first pending)
            restList (rest pending)]
        (if head
          (if (= (current :size) (head :size))
            (do
              (services/remove-file (head :name))
              (recur current restList))
            (recur head restList)))))))

(defn main [& args]
  (println "Hello, World: " args))
