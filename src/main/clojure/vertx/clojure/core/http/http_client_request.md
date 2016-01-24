# io.vertx.core.http.HttpClientRequest - d
##imported types concrete:true{java.lang=[Throwable, Void, String], io.vertx.core.streams=[WriteStream, ReadStream], io.vertx.core=[MultiMap, Handler], io.vertx.core.http=[HttpClientResponse, HttpClientRequest, HttpMethod], io.vertx.core.buffer=[Buffer]} - java.lang.Throwable  , pkg = java.lang
- io.vertx.core.http.HttpClientResponse  , pkg = io.vertx.core.http
- io.vertx.core.http.HttpClientRequest  , pkg = io.vertx.core.http
- java.lang.Void  , pkg = java.lang
- io.vertx.core.buffer.Buffer  , pkg = io.vertx.core.buffer
- io.vertx.core.streams.WriteStream  , pkg = io.vertx.core.streams
- io.vertx.core.http.HttpMethod  , pkg = io.vertx.core.http
- io.vertx.core.streams.ReadStream  , pkg = io.vertx.core.streams
- io.vertx.core.MultiMap  , pkg = io.vertx.core
- java.lang.String  , pkg = java.lang
- io.vertx.core.Handler  , pkg = io.vertx.core
## Methods- writeQueueFull()
- exceptionHandler(handler )
- write(data )
- setWriteQueueMaxSize(maxSize )
- drainHandler(handler )
- handler(handler )
- pause()
- resume()
- endHandler(endHandler )
- setChunked(chunked )
- isChunked()
- method()
- uri()
- headers()
- putHeader(name ,value )
- write(chunk )
- write(chunk ,enc )
- continueHandler(handler )
- sendHead()
- end(chunk )
- end(chunk ,enc )
- end(chunk )
- end()
- setTimeout(timeoutMs )
#method map{resume=[io.vertx.core.http.HttpClientRequest resume()], handler=[io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)], headers=[io.vertx.core.MultiMap headers()], method=[io.vertx.core.http.HttpMethod method()], writeQueueFull=[boolean writeQueueFull()], setChunked=[io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)], uri=[java.lang.String uri()], setWriteQueueMaxSize=[io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)], pause=[io.vertx.core.http.HttpClientRequest pause()], continueHandler=[io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)], setTimeout=[io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)], drainHandler=[io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)], isChunked=[boolean isChunked()], endHandler=[io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)], putHeader=[io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)], end=[void end(java.lang.String chunk), void end(java.lang.String chunk, java.lang.String enc), void end(io.vertx.core.buffer.Buffer chunk), void end()], exceptionHandler=[io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)], write=[io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)], sendHead=[io.vertx.core.http.HttpClientRequest sendHead()]} 
- resume , [io.vertx.core.http.HttpClientRequest resume()]
- handler , [io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)]
- headers , [io.vertx.core.MultiMap headers()]
- method , [io.vertx.core.http.HttpMethod method()]
- writeQueueFull , [boolean writeQueueFull()]
- setChunked , [io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)]
- uri , [java.lang.String uri()]
- setWriteQueueMaxSize , [io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)]
- pause , [io.vertx.core.http.HttpClientRequest pause()]
- continueHandler , [io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)]
- setTimeout , [io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)]
- drainHandler , [io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)]
- isChunked , [boolean isChunked()]
- endHandler , [io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)]
- putHeader , [io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)]
- end , [void end(java.lang.String chunk), void end(java.lang.String chunk, java.lang.String enc), void end(io.vertx.core.buffer.Buffer chunk), void end()]
- exceptionHandler , [io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)]
- write , [io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)]
- sendHead , [io.vertx.core.http.HttpClientRequest sendHead()]