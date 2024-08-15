(defproject versiontool
  "0.1.0-SNAPSHOT"

  :description "Version number file management in Clojure"
  :url "https://github.com/tammymakesthings/versiontool"
  :license {:name "MIT"
            :url "https://opensource.org/license/mit"}

  :main ^:skip-aot versiontool.main
  :target-path "target/%s"

  :plugins [
            [dev.weavejester/lein-cljfmt "0.12.0"]
            [cider/cider-nrepl "0.49.2"]
            [lein-cprint "1.3.3"]
            [philoskim/debux "0.6.5"]
            [lein-autoreload "0.1.1"]
           ]

  :dependencies
  [
   [org.clojure/clojure "1.11.1"]
   [org.babashka/cli "0.8.60"]
   [marick/suchwow "6.0.0"] 
   [clansi "1.0.0"]
   ]

  :cljfmt {
           :load-config-file? true
           }
  :profiles
  {
   :uberjar
   {
    :aot :all
    :jvm-opts [
               "-Dclojure.compiler.direct-linking=true"
               ]
    }
   }
  )
