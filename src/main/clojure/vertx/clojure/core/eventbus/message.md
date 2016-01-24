# io.vertx.core.eventbus.Message - d
##imported types concrete:true{java.lang=[Object, String], io.vertx.core=[MultiMap, AsyncResult, Handler], io.vertx.core.eventbus=[DeliveryOptions, Message]} - io.vertx.core.eventbus.DeliveryOptions  , pkg = io.vertx.core.eventbus
- io.vertx.core.MultiMap  , pkg = io.vertx.core
- io.vertx.core.eventbus.Message  , pkg = io.vertx.core.eventbus
- java.lang.Object  , pkg = java.lang
- java.lang.String  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- io.vertx.core.Handler  , pkg = io.vertx.core
## Methods- address()
- headers()
- body()
- replyAddress()
- reply(message )
- reply(message ,replyHandler )
- reply(message ,options )
- reply(message ,options ,replyHandler )
- fail(failureCode ,message )
#method map{headers=[io.vertx.core.MultiMap headers()], fail=[void fail(int failureCode, java.lang.String message)], address=[java.lang.String address()], body=[T body()], reply=[void reply(java.lang.Object message), <R> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler), void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options), <R> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)], replyAddress=[java.lang.String replyAddress()]} 
- headers , [io.vertx.core.MultiMap headers()]
- fail , [void fail(int failureCode, java.lang.String message)]
- address , [java.lang.String address()]
- body , [T body()]
- reply , [void reply(java.lang.Object message), <R> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler), void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options), <R> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)]
- replyAddress , [java.lang.String replyAddress()]
