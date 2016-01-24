(ns vertx.clojure.core.buffer.buffer 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  String)
    (io.vertx.core.shareddata.impl  ClusterSerializable)
    (io.vertx.core.buffer  Buffer)
  ))
