(ns vertx.clojure.core.http.http-client-request 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Throwable Void String)
    (io.vertx.core.streams  WriteStream ReadStream)
    (io.vertx.core  MultiMap Handler)
    (io.vertx.core.http  HttpClientResponse HttpClientRequest HttpMethod)
    (io.vertx.core.buffer  Buffer)
  ))
