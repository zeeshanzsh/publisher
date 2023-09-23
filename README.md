<img width="1437" alt="Screenshot 2023-09-23 at 11 16 33 PM" src="https://github.com/zeeshanzsh/publisher/assets/30749560/3694869c-70d7-46ff-ab30-6cb97493ea55">
# publisher Service

Publisher code with REST Endpoint with Jenkins CI pipeline

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
