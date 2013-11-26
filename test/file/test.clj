(ns file.test
  (:use midje.sweet)
  (:require
    [file.main :as main]
    [file.services :as services]))

; MAIN TESTS
(fact "There are two files of the same size"
    (main/remove-duplicated "test") => nil
    (provided (services/get-files "test") => [{:name "f1" :size 100} {:name "f2" :size 200} {:name "f3" :size 100}])
    (provided (services/remove-file "f3") => nil))

(fact "There are four files of the same size"
    (main/remove-duplicated "test") => nil
    (provided (services/get-files "test") => [{:name "f1" :size 100} {:name "f2" :size 100} {:name "f3" :size 100} {:name "f4" :size 100}])
    (provided (services/remove-file "f2") => nil)
    (provided (services/remove-file "f3") => nil)
    (provided (services/remove-file "f4") => nil))

; SERVICES TEST
