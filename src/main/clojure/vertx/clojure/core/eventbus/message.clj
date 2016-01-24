(ns vertx.clojure.core.eventbus.message 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Object String)
    (io.vertx.core  MultiMap AsyncResult Handler)
    (io.vertx.core.eventbus  DeliveryOptions Message)
  ))
