# springboot-microservices

**Spring Boot Actuator** - In essence, Actuator brings production-ready features to our application.
Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency.
The main benefit of this library is that we can get production-grade tools without having to actually implement these features ourselves.
Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.

**Add this property to expose all the URLs** - management.endpoints.jmx.exposure.include=*

---
**Spring Boot HAL Explorer** 

The HAL model revolves around two simple concepts.

Resources, which contain:
1. Links to relevant URIs
2. Embedded Resources
3. State

Links:
1. A target URI
2. A relation, or rel, to the link
3. A few other optional properties to help with depreciation, content negotiation, etc

The HAL browser was created by the same person who developed HAL and provides an in-browser GUI to traverse your REST API.

---

**Versioning**

1. Media type versioning (a.k.a “content negotiation” or “accept header”) - GitHub
2. (Custom) headers versioning - Microsoft
3. URI Versioning - Twitter
4. Request Parameter versioning - Amazon

**Factors** - URI Pollution,Misuse of HTTP Headers,Caching,Can we execute the request on the browser?,API Documentation

***More***
1. https://www.mnot.net/blog/2011/10/25/web_api_versioning_smackdown
2. http://urthen.github.io/2013/05/09/ways-to-version-your-api/
3. http://stackoverflow.com/questions/389169/best-practices-for-api-versioning
4. http://www.lexicalscope.com/blog/2012/03/12/how-are-rest-apis-versioned/
5. https://www.3scale.net/2016/06/api-versioning-methods-a-brief-reference/

---

**Microservices Challenges**

1. Bounded Context
2. Configuration Manangement
3. Dynamic Scale Up and Scale Down
4. Visibility
5. Pack of Cards - How one microservice fault can take down all the microservices

---
**Microservices Advantages**

1. New Technology and Process Adaption
2. Dynamic Scaling

---
**Docker**

**Recommendation 1**

If you are using Windows, make sure that you use PowerShell instead of Command Prompt.

**Recommendation 2**

If you are using Window 10 and are using docker toolbox

=> Use 192.168.99.100 instead of localhost.

Note: If 192.168.99.100 does not work, you can find the IP by using the command docker-machine ip

**Reason**=>In Window 10 when using docker toolbox, docker is configured to use the default machine with IP 192.168.99.100

=>Docker Registry : https://hub.docker.com

=>Running Version of Image : Container

**-- General Commands --**

1. docker run 'Repository:Tag'
2. docker run -p {host-port}:{container-port} -d 'Repository:Tag' => Running container in detached mode (-d)
3. docker logs -f 'id' => Tailing Logs
4. docker container ls => Shows running containers
5. docker container ls -a => Shows all the containers irrespective of thier status
6. docker images => Shows only pulled images on local
7. docker container stop 'id' => To stop the running container
8. docker pull mysql
9. docker search mysql
10. docker image history 'imageId'
11. docker image inspect 'imageId'
12. docker image remove 'imageId' => Only remove from local machine
13. docker container pause 'Id'
14. docker container unpause 'Id'
15. docker container stop 'Id' => Stop gracefully
16. docker container kill 'Id' => Immediately terminate the process
17. docker stats
17. docker events
18. docker top 'Id'
19. docker run -m 512m --cpu quota 50000
20. docker system df
---


