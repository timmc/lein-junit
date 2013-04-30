(defproject org.clojars.brightcove/lein-junit "1.0.4-bc0"
  :author "Caspar Florian Ebeling, Roman Scherer"
  :description "JUnit plugin for Leiningen. Max Mao made a change to compile test code only."
  :url "http://github.com/timmc/lein-junit"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :min-lein-version "2.0.0"
  :dependencies [[ant/ant-junit "1.6.5"]
                 [lancet "1.0.1"]
                 [junit/junit "4.10"]]
  :eval-in-leiningen true)
