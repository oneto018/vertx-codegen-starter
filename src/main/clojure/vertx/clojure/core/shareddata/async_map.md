# io.vertx.core.shareddata.AsyncMap - d
##imported types concrete:true{java.lang=[Void, Boolean, Integer], io.vertx.core=[AsyncResult, Handler]} - java.lang.Void  , pkg = java.lang
- java.lang.Boolean  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- io.vertx.core.Handler  , pkg = io.vertx.core
- java.lang.Integer  , pkg = java.lang
## Methods- get(k ,resultHandler )
- put(k ,v ,completionHandler )
- put(k ,v ,ttl ,completionHandler )
- putIfAbsent(k ,v ,completionHandler )
- putIfAbsent(k ,v ,ttl ,completionHandler )
- remove(k ,resultHandler )
- removeIfPresent(k ,v ,resultHandler )
- replace(k ,v ,resultHandler )
- replaceIfPresent(k ,oldValue ,newValue ,resultHandler )
- clear(resultHandler )
- size(resultHandler )
#method map{replaceIfPresent=[void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler)], size=[void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler)], get=[void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler)], replace=[void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler)], clear=[void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)], putIfAbsent=[void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler), void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler)], put=[void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler), void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)], remove=[void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler)], removeIfPresent=[void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler)]} 
- replaceIfPresent , [void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler)]
- size , [void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler)]
- get , [void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler)]
- replace , [void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler)]
- clear , [void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)]
- putIfAbsent , [void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler), void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler)]
- put , [void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler), void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)]
- remove , [void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler)]
- removeIfPresent , [void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler)]
