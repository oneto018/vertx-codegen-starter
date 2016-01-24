(ns vertx.clojure.core.eventbus.message-consumer 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Throwable Void String)
    (io.vertx.core.streams  ReadStream)
    (io.vertx.core  AsyncResult Handler)
    (io.vertx.core.eventbus  Message MessageConsumer)
  ))
