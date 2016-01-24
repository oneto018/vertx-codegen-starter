(ns vertx.clojure.core.vertx 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (io.vertx.core.shareddata  SharedData)
    (java.lang  Long String Void)
    (java.util  Set)
    (io.vertx.core.datagram  DatagramSocket DatagramSocketOptions)
    (io.vertx.core  Context TimeoutStream AsyncResult Vertx VertxOptions Future DeploymentOptions Handler)
    (io.vertx.core.metrics  Measured)
    (io.vertx.core.dns  DnsClient)
    (io.vertx.core.file  FileSystem)
    (io.vertx.core.eventbus  EventBus)
    (io.vertx.core.net  NetClient NetClientOptions NetServerOptions NetServer)
    (io.vertx.core.http  HttpServer HttpClientOptions HttpServerOptions HttpClient)
  ))
