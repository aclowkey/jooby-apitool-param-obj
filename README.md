# jooby-apitool-param-obj
An example of jooby project with incorrect API documentation for parameter objects


## How to test:
- mvn compile
- start the server
- curl -X GET 'http://localhost:8080?arg1=a&arg2=b&arg3=c' # Should return the args
- see http://localhost:8080/swagger#//_MyRoute_myApi doesn't specify the parameters
