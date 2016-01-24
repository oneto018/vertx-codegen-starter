(ns vertx.clojure.core.datagram.datagram-socket 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Throwable Void String)
    (io.vertx.core.datagram  PacketWritestream DatagramPacket DatagramSocket)
    (io.vertx.core.streams  ReadStream)
    (io.vertx.core  AsyncResult Handler)
    (io.vertx.core.metrics  Measured)
    (io.vertx.core.net  SocketAddress)
    (io.vertx.core.buffer  Buffer)
  ))
