(ns versiontool.core
    (:require [clojure.string :as str])
    (:gen-class)
)

(def parse-versionstring
    "Convert a version string to a versionspec."
    [versionstr] 
    (apply sorted-map (interleave [:major :minor :revision :build] 
                                  (take 4 (map #(Integer/parseInt %) 
                                               (conj 
                                                   (str/split versionstr #"\." -4) 
                                                   "0" "0" "0" "0"))))))

(def unparse-versionspec
    "Convert a version spec to a version string."
    [versionspec]
    (str/join "." [(:major versionspec) 
                   (:minor versionspec) 
                   (:revision versionspec) 
                   (:build versionspec)]))

