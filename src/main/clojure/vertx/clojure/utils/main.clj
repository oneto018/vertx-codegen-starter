(ns vertx.clojure.utils.main
  (import io.vertx.core.Handler)
  (import io.vertx.core.AsyncResult)
  (import io.vertx.core.Future)
  (:require [camel-snake-kebab.core :refer :all]
            [clojure.string :as s]))


(defn ^Handler get-handler* [f]
  (reify io.vertx.core.Handler 
    (handle [this req]
      (f req))))

(defn ^Handler get-aync-result-handler* [f]
  (reify io.vertx.core.Handler 
    (handle [this req]
      (let [^AsyncResult req]
        (f req)))))


(defn ^Handler get-future-handler* [f]
  (reify io.vertx.core.Handler 
    (handle [this req]
      (let [^Future req]
        (f req)))))