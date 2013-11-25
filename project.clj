(defproject clojure-kata "0.1.0-SNAPSHOT"
  :description "Files Kata"

  :license
    { :name "Apache License 2.0"
      :url "http://www.apache.org/licenses/LICENSE-2.0.html"}

  :dependencies
    [[org.clojure/clojure "1.5.1"]
     [org.clojure/clojure-contrib "1.2.0"]
     [speclj "2.8.1"]]

  :plugins [[speclj "2.8.1"]]
  :test-paths ["spec"]
  :main file.main/main)
