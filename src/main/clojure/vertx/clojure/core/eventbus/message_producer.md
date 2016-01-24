# io.vertx.core.eventbus.MessageProducer - d
##imported types concrete:true{java.lang=[Throwable, Void, String], io.vertx.core.streams=[WriteStream], io.vertx.core=[Handler], io.vertx.core.eventbus=[DeliveryOptions, MessageProducer]} - java.lang.Throwable  , pkg = java.lang
- java.lang.Void  , pkg = java.lang
- io.vertx.core.eventbus.DeliveryOptions  , pkg = io.vertx.core.eventbus
- io.vertx.core.streams.WriteStream  , pkg = io.vertx.core.streams
- java.lang.String  , pkg = java.lang
- io.vertx.core.Handler  , pkg = io.vertx.core
- io.vertx.core.eventbus.MessageProducer  , pkg = io.vertx.core.eventbus
## Methods- writeQueueFull()
- exceptionHandler(handler )
- write(data )
- setWriteQueueMaxSize(maxSize )
- drainHandler(handler )
- deliveryOptions(options )
- address()
#method map{address=[java.lang.String address()], drainHandler=[io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)], writeQueueFull=[boolean writeQueueFull()], exceptionHandler=[io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)], write=[io.vertx.core.eventbus.MessageProducer<T> write(T data)], setWriteQueueMaxSize=[io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)], deliveryOptions=[io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)]} 
- address , [java.lang.String address()]
- drainHandler , [io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)]
- writeQueueFull , [boolean writeQueueFull()]
- exceptionHandler , [io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)]
- write , [io.vertx.core.eventbus.MessageProducer<T> write(T data)]
- setWriteQueueMaxSize , [io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)]
- deliveryOptions , [io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)]
