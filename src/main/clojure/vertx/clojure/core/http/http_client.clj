(ns vertx.clojure.core.http.http-client 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Throwable String)
    (io.vertx.core  MultiMap Handler)
    (io.vertx.core.metrics  Measured)
    (io.vertx.core.http  HttpClientRequest HttpClientResponse HttpMethod WebSocketStream WebSocket WebsocketVersion HttpClient)
  ))
