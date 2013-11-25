(ns file.main-spec
  (:use [clojure.contrib.mock])
  (:require [speclj.core :refer :all]
            [file.main :as main]
            [file.services :as services]))

(describe "Delete files"
  (it "If there are two files of the same size delete one"
    (with-redefs [services/get-files (fn [dir] [{:name "f1" :size 100} {:name "f2" :size 100}])]
      (expect [services/remove-file (times 1)]
        (main/remove-duplicated "directory")
    ))))
