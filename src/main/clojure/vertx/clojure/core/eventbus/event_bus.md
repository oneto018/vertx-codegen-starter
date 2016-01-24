# io.vertx.core.eventbus.EventBus - d
##imported types concrete:true{java.lang=[Object, String], io.vertx.core=[AsyncResult, Handler], io.vertx.core.metrics=[Measured], io.vertx.core.eventbus=[DeliveryOptions, EventBus, Message, MessageConsumer, MessageProducer]} - io.vertx.core.eventbus.DeliveryOptions  , pkg = io.vertx.core.eventbus
- io.vertx.core.eventbus.EventBus  , pkg = io.vertx.core.eventbus
- io.vertx.core.metrics.Measured  , pkg = io.vertx.core.metrics
- io.vertx.core.eventbus.Message  , pkg = io.vertx.core.eventbus
- java.lang.Object  , pkg = java.lang
- java.lang.String  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- io.vertx.core.Handler  , pkg = io.vertx.core
- io.vertx.core.eventbus.MessageConsumer  , pkg = io.vertx.core.eventbus
- io.vertx.core.eventbus.MessageProducer  , pkg = io.vertx.core.eventbus
## Methods- isMetricsEnabled()
- send(address ,message )
- send(address ,message ,replyHandler )
- send(address ,message ,options )
- send(address ,message ,options ,replyHandler )
- publish(address ,message )
- publish(address ,message ,options )
- consumer(address )
- consumer(address ,handler )
- localConsumer(address )
- localConsumer(address ,handler )
- sender(address )
- sender(address ,options )
- publisher(address )
- publisher(address ,options )
#method map{isMetricsEnabled=[boolean isMetricsEnabled()], localConsumer=[<T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address), <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler)], sender=[<T> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address), <T> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options)], publish=[io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message), io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)], publisher=[<T> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address), <T> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options)], send=[io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message), <T> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler), io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options), <T> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler)], consumer=[<T> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address), <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler)]} 
- isMetricsEnabled , [boolean isMetricsEnabled()]
- localConsumer , [<T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address), <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler)]
- sender , [<T> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address), <T> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options)]
- publish , [io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message), io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)]
- publisher , [<T> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address), <T> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options)]
- send , [io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message), <T> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler), io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options), <T> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler)]
- consumer , [<T> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address), <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler)]
