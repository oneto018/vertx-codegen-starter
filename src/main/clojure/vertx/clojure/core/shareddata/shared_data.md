# io.vertx.core.shareddata.SharedData - d
##imported types concrete:true{io.vertx.core.shareddata=[AsyncMap, Lock, LocalMap, Counter], java.lang=[String], io.vertx.core=[AsyncResult, Handler]} - io.vertx.core.shareddata.AsyncMap  , pkg = io.vertx.core.shareddata
- io.vertx.core.shareddata.Lock  , pkg = io.vertx.core.shareddata
- io.vertx.core.shareddata.LocalMap  , pkg = io.vertx.core.shareddata
- io.vertx.core.shareddata.Counter  , pkg = io.vertx.core.shareddata
- java.lang.String  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- io.vertx.core.Handler  , pkg = io.vertx.core
## Methods- getClusterWideMap(name ,resultHandler )
- getLock(name ,resultHandler )
- getLockWithTimeout(name ,timeout ,resultHandler )
- getCounter(name ,resultHandler )
- getLocalMap(name )
#method map{getCounter=[void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler)], getLocalMap=[<K, V> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name)], getLock=[void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler)], getClusterWideMap=[<K, V> void getClusterWideMap(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>> resultHandler)], getLockWithTimeout=[void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler)]} 
- getCounter , [void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler)]
- getLocalMap , [<K, V> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name)]
- getLock , [void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler)]
- getClusterWideMap , [<K, V> void getClusterWideMap(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>> resultHandler)]
- getLockWithTimeout , [void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler)]
