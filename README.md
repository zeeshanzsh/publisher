# publisher Service

Publisher code with REST Endpoint with Jenkins pipeline

***Jenkins steps:***
```
1. Pull the code from git
2. build the project 
3. Build the Docker Image
4. Push the Image to Docker-hub
```

***Publisher endpoint***

```agsl
health check:
http://localhost:9090/

Flux Publisher
GET: http://localhost:9090/even-numbers
GET: http://localhost:9090/even-numbers
```