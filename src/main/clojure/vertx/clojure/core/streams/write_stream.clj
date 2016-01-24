(ns vertx.clojure.core.streams.write-stream 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Throwable Void)
    (io.vertx.core.streams  WriteStream StreamBase)
    (io.vertx.core  Handler)
  ))
