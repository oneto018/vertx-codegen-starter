# io.vertx.core.Vertx - d
##imported types concrete:true{io.vertx.core.shareddata=[SharedData], java.lang=[Long, String, Void], java.util=[Set], io.vertx.core.datagram=[DatagramSocket, DatagramSocketOptions], io.vertx.core=[Context, TimeoutStream, AsyncResult, Vertx, VertxOptions, Future, DeploymentOptions, Handler], io.vertx.core.metrics=[Measured], io.vertx.core.dns=[DnsClient], io.vertx.core.file=[FileSystem], io.vertx.core.eventbus=[EventBus], io.vertx.core.net=[NetClient, NetClientOptions, NetServerOptions, NetServer], io.vertx.core.http=[HttpServer, HttpClientOptions, HttpServerOptions, HttpClient]} - io.vertx.core.datagram.DatagramSocket  , pkg = io.vertx.core.datagram
- io.vertx.core.http.HttpServer  , pkg = io.vertx.core.http
- io.vertx.core.Context  , pkg = io.vertx.core
- io.vertx.core.shareddata.SharedData  , pkg = io.vertx.core.shareddata
- io.vertx.core.TimeoutStream  , pkg = io.vertx.core
- io.vertx.core.eventbus.EventBus  , pkg = io.vertx.core.eventbus
- java.lang.Long  , pkg = java.lang
- io.vertx.core.AsyncResult  , pkg = io.vertx.core
- io.vertx.core.http.HttpClientOptions  , pkg = io.vertx.core.http
- io.vertx.core.datagram.DatagramSocketOptions  , pkg = io.vertx.core.datagram
- java.lang.String  , pkg = java.lang
- io.vertx.core.net.NetClient  , pkg = io.vertx.core.net
- java.lang.Void  , pkg = java.lang
- io.vertx.core.Vertx  , pkg = io.vertx.core
- io.vertx.core.VertxOptions  , pkg = io.vertx.core
- java.util.Set  , pkg = java.util
- io.vertx.core.Future  , pkg = io.vertx.core
- io.vertx.core.net.NetClientOptions  , pkg = io.vertx.core.net
- io.vertx.core.dns.DnsClient  , pkg = io.vertx.core.dns
- io.vertx.core.net.NetServerOptions  , pkg = io.vertx.core.net
- io.vertx.core.metrics.Measured  , pkg = io.vertx.core.metrics
- io.vertx.core.net.NetServer  , pkg = io.vertx.core.net
- io.vertx.core.DeploymentOptions  , pkg = io.vertx.core
- io.vertx.core.file.FileSystem  , pkg = io.vertx.core.file
- io.vertx.core.http.HttpServerOptions  , pkg = io.vertx.core.http
- io.vertx.core.Handler  , pkg = io.vertx.core
- io.vertx.core.http.HttpClient  , pkg = io.vertx.core.http
## Methods- isMetricsEnabled()
- vertx()
- vertx(options )
- clusteredVertx(options ,resultHandler )
- currentContext()
- getOrCreateContext()
- createNetServer(options )
- createNetServer()
- createNetClient(options )
- createNetClient()
- createHttpServer(options )
- createHttpServer()
- createHttpClient(options )
- createHttpClient()
- createDatagramSocket(options )
- createDatagramSocket()
- fileSystem()
- eventBus()
- createDnsClient(port ,host )
- sharedData()
- setTimer(delay ,handler )
- timerStream(delay )
- setPeriodic(delay ,handler )
- periodicStream(delay )
- cancelTimer(id )
- runOnContext(action )
- close()
- close(completionHandler )
- deployVerticle(name )
- deployVerticle(name ,completionHandler )
- deployVerticle(name ,options )
- deployVerticle(name ,options ,completionHandler )
- undeploy(deploymentID )
- undeploy(deploymentID ,completionHandler )
- deploymentIDs()
- isClustered()
- executeBlocking(blockingCodeHandler ,ordered ,resultHandler )
- executeBlocking(blockingCodeHandler ,resultHandler )
#method map{createNetServer=[io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options), io.vertx.core.net.NetServer createNetServer()], deployVerticle=[void deployVerticle(java.lang.String name), void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler), void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options), void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler)], currentContext=[io.vertx.core.Context currentContext()], vertx=[io.vertx.core.Vertx vertx(), io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options)], eventBus=[io.vertx.core.eventbus.EventBus eventBus()], createHttpServer=[io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options), io.vertx.core.http.HttpServer createHttpServer()], createNetClient=[io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options), io.vertx.core.net.NetClient createNetClient()], cancelTimer=[boolean cancelTimer(long id)], close=[void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)], deploymentIDs=[java.util.Set<java.lang.String> deploymentIDs()], timerStream=[io.vertx.core.TimeoutStream timerStream(long delay)], isMetricsEnabled=[boolean isMetricsEnabled()], fileSystem=[io.vertx.core.file.FileSystem fileSystem()], clusteredVertx=[void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler)], createHttpClient=[io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options), io.vertx.core.http.HttpClient createHttpClient()], periodicStream=[io.vertx.core.TimeoutStream periodicStream(long delay)], sharedData=[io.vertx.core.shareddata.SharedData sharedData()], setPeriodic=[long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler)], createDnsClient=[io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host)], isClustered=[boolean isClustered()], runOnContext=[void runOnContext(io.vertx.core.Handler<java.lang.Void> action)], getOrCreateContext=[io.vertx.core.Context getOrCreateContext()], createDatagramSocket=[io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options), io.vertx.core.datagram.DatagramSocket createDatagramSocket()], setTimer=[long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler)], executeBlocking=[<T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler), <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler)], undeploy=[void undeploy(java.lang.String deploymentID), void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)]} 
- createNetServer , [io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options), io.vertx.core.net.NetServer createNetServer()]
- deployVerticle , [void deployVerticle(java.lang.String name), void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler), void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options), void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler)]
- currentContext , [io.vertx.core.Context currentContext()]
- vertx , [io.vertx.core.Vertx vertx(), io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options)]
- eventBus , [io.vertx.core.eventbus.EventBus eventBus()]
- createHttpServer , [io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options), io.vertx.core.http.HttpServer createHttpServer()]
- createNetClient , [io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options), io.vertx.core.net.NetClient createNetClient()]
- cancelTimer , [boolean cancelTimer(long id)]
- close , [void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)]
- deploymentIDs , [java.util.Set<java.lang.String> deploymentIDs()]
- timerStream , [io.vertx.core.TimeoutStream timerStream(long delay)]
- isMetricsEnabled , [boolean isMetricsEnabled()]
- fileSystem , [io.vertx.core.file.FileSystem fileSystem()]
- clusteredVertx , [void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler)]
- createHttpClient , [io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options), io.vertx.core.http.HttpClient createHttpClient()]
- periodicStream , [io.vertx.core.TimeoutStream periodicStream(long delay)]
- sharedData , [io.vertx.core.shareddata.SharedData sharedData()]
- setPeriodic , [long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler)]
- createDnsClient , [io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host)]
- isClustered , [boolean isClustered()]
- runOnContext , [void runOnContext(io.vertx.core.Handler<java.lang.Void> action)]
- getOrCreateContext , [io.vertx.core.Context getOrCreateContext()]
- createDatagramSocket , [io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options), io.vertx.core.datagram.DatagramSocket createDatagramSocket()]
- setTimer , [long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler)]
- executeBlocking , [<T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler), <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler)]
- undeploy , [void undeploy(java.lang.String deploymentID), void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)]