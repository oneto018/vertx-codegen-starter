(ns vertx.clojure.core.shareddata.async-map 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Void Boolean Integer)
    (io.vertx.core  AsyncResult Handler)
  ))
