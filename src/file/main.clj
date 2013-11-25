(ns file.main
  (:require
    [file.services :as services]))

(defn remove-duplicated [dir]
  (println "Removing duplicated files from: " dir))

(defn main [& args]
  (println "Hello, World: " args))
