# io.vertx.core.http.HttpServer - d
##imported types concrete:true{java.lang=[Void, String], io.vertx.core=[AsyncResult, Handler], io.vertx.core.metrics=[Measured], io.vertx.core.http=[HttpServerRequest, ServerWebSocket, HttpServerRequestStream, HttpServer, ServerWebSocketStream]} - java.lang.Void  , pkg = java.lang
- io.vertx.core.http.HttpServerRequest  , pkg = io.vertx.core.http
- io.vertx.core.http.ServerWebSocket  , pkg = io.vertx.core.http
- io.vertx.core.metrics.Measured  , pkg = io.vertx.core.metrics
- io.vertx.core.http.HttpServerRequestStream  , pkg = io.vertx.core.http
- io.vertx.core.http.HttpServer  , pkg = io.vertx.core.http
- java.lang.String  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- io.vertx.core.Handler  , pkg = io.vertx.core
- io.vertx.core.http.ServerWebSocketStream  , pkg = io.vertx.core.http
## Methods- isMetricsEnabled()
- requestStream()
- requestHandler(handler )
- websocketStream()
- websocketHandler(handler )
- listen()
- listen(port ,host )
- listen(port ,host ,listenHandler )
- listen(port )
- listen(port ,listenHandler )
- listen(listenHandler )
- close()
- close(completionHandler )
#method map{isMetricsEnabled=[boolean isMetricsEnabled()], requestHandler=[io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)], websocketStream=[io.vertx.core.http.ServerWebSocketStream websocketStream()], requestStream=[io.vertx.core.http.HttpServerRequestStream requestStream()], websocketHandler=[io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)], close=[void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)], listen=[io.vertx.core.http.HttpServer listen(), io.vertx.core.http.HttpServer listen(int port, java.lang.String host), io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(int port), io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)]} 
- isMetricsEnabled , [boolean isMetricsEnabled()]
- requestHandler , [io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)]
- websocketStream , [io.vertx.core.http.ServerWebSocketStream websocketStream()]
- requestStream , [io.vertx.core.http.HttpServerRequestStream requestStream()]
- websocketHandler , [io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)]
- close , [void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)]
- listen , [io.vertx.core.http.HttpServer listen(), io.vertx.core.http.HttpServer listen(int port, java.lang.String host), io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(int port), io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)]
