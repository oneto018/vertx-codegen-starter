(ns vertx.clojure.core.dns.dns-client 
  (:require [camel-snake-kebab.core :refer :all]
            [vertx.clojure.utils.main :as util])
  (:import 
     (java.util  List)
    (java.lang  String)
    (io.vertx.core  AsyncResult Handler)
    (io.vertx.core.dns  DnsClient MxRecord SrvRecord)
  ))
