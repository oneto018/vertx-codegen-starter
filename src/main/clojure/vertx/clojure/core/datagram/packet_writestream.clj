(ns vertx.clojure.core.datagram.packet-writestream 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.lang  Throwable Void)
    (io.vertx.core.datagram  PacketWritestream)
    (io.vertx.core.streams  WriteStream)
    (io.vertx.core  Handler)
    (io.vertx.core.buffer  Buffer)
  ))
