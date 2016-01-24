# io.vertx.core.net.NetServer - d
##imported types concrete:true{java.lang=[Void, String], io.vertx.core=[AsyncResult, Handler], io.vertx.core.metrics=[Measured], io.vertx.core.net=[NetSocketStream, NetServer, NetSocket]} - io.vertx.core.net.NetSocketStream  , pkg = io.vertx.core.net
- java.lang.Void  , pkg = java.lang
- io.vertx.core.metrics.Measured  , pkg = io.vertx.core.metrics
- io.vertx.core.net.NetServer  , pkg = io.vertx.core.net
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- java.lang.String  , pkg = java.lang
- io.vertx.core.Handler  , pkg = io.vertx.core
- io.vertx.core.net.NetSocket  , pkg = io.vertx.core.net
## Methods- isMetricsEnabled()
- connectStream()
- connectHandler(handler )
- listen()
- listen(listenHandler )
- listen(port ,host )
- listen(port ,host ,listenHandler )
- listen(port )
- listen(port ,listenHandler )
- close()
- close(completionHandler )
- actualPort()
#method map{isMetricsEnabled=[boolean isMetricsEnabled()], actualPort=[int actualPort()], connectHandler=[io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)], connectStream=[io.vertx.core.net.NetSocketStream connectStream()], close=[void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)], listen=[io.vertx.core.net.NetServer listen(), io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler), io.vertx.core.net.NetServer listen(int port, java.lang.String host), io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler), io.vertx.core.net.NetServer listen(int port), io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler)]} 
- isMetricsEnabled , [boolean isMetricsEnabled()]
- actualPort , [int actualPort()]
- connectHandler , [io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)]
- connectStream , [io.vertx.core.net.NetSocketStream connectStream()]
- close , [void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)]
- listen , [io.vertx.core.net.NetServer listen(), io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler), io.vertx.core.net.NetServer listen(int port, java.lang.String host), io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler), io.vertx.core.net.NetServer listen(int port), io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler)]
