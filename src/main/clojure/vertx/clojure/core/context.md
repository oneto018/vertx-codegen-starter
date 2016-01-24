# io.vertx.core.Context - d
##imported types concrete:true{java.lang=[Void, Object, String], java.util=[List], io.vertx.core=[Vertx, AsyncResult, Handler, Future], io.vertx.core.json=[JsonObject]} - java.lang.Void  , pkg = java.lang
- java.util.List  , pkg = java.util
- io.vertx.core.Vertx  , pkg = io.vertx.core
- io.vertx.core.json.JsonObject  , pkg = io.vertx.core.json
- java.lang.Object  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- java.lang.String  , pkg = java.lang
- io.vertx.core.Handler  , pkg = io.vertx.core
- io.vertx.core.Future  , pkg = io.vertx.core
## Methods- isOnWorkerThread()
- isOnEventLoopThread()
- isOnVertxThread()
- runOnContext(action )
- executeBlocking(blockingCodeHandler ,ordered ,resultHandler )
- executeBlocking(blockingCodeHandler ,resultHandler )
- deploymentID()
- config()
- processArgs()
- isEventLoopContext()
- isWorkerContext()
- isMultiThreadedWorkerContext()
- get(key )
- put(key ,value )
- remove(key )
- owner()
- getInstanceCount()
#method map{owner=[io.vertx.core.Vertx owner()], processArgs=[java.util.List<java.lang.String> processArgs()], getInstanceCount=[int getInstanceCount()], isWorkerContext=[boolean isWorkerContext()], isOnWorkerThread=[boolean isOnWorkerThread()], isOnVertxThread=[boolean isOnVertxThread()], put=[void put(java.lang.String key, java.lang.Object value)], remove=[boolean remove(java.lang.String key)], isMultiThreadedWorkerContext=[boolean isMultiThreadedWorkerContext()], deploymentID=[java.lang.String deploymentID()], get=[<T> T get(java.lang.String key)], isOnEventLoopThread=[boolean isOnEventLoopThread()], runOnContext=[void runOnContext(io.vertx.core.Handler<java.lang.Void> action)], isEventLoopContext=[boolean isEventLoopContext()], executeBlocking=[<T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler), <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler)], config=[io.vertx.core.json.JsonObject config()]} 
- owner , [io.vertx.core.Vertx owner()]
- processArgs , [java.util.List<java.lang.String> processArgs()]
- getInstanceCount , [int getInstanceCount()]
- isWorkerContext , [boolean isWorkerContext()]
- isOnWorkerThread , [boolean isOnWorkerThread()]
- isOnVertxThread , [boolean isOnVertxThread()]
- put , [void put(java.lang.String key, java.lang.Object value)]
- remove , [boolean remove(java.lang.String key)]
- isMultiThreadedWorkerContext , [boolean isMultiThreadedWorkerContext()]
- deploymentID , [java.lang.String deploymentID()]
- get , [<T> T get(java.lang.String key)]
- isOnEventLoopThread , [boolean isOnEventLoopThread()]
- runOnContext , [void runOnContext(io.vertx.core.Handler<java.lang.Void> action)]
- isEventLoopContext , [boolean isEventLoopContext()]
- executeBlocking , [<T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler), <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler)]
- config , [io.vertx.core.json.JsonObject config()]