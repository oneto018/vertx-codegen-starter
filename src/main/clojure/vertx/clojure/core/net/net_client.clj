(ns vertx.clojure.core.net.net-client 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  String)
    (io.vertx.core  AsyncResult Handler)
    (io.vertx.core.metrics  Measured)
    (io.vertx.core.net  NetClient NetSocket)
  ))
