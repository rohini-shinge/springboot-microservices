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

Links to relevant URIs
Embedded Resources
State
Links:

A target URI
A relation, or rel, to the link
A few other optional properties to help with depreciation, content negotiation, etc
The HAL browser was created by the same person who developed HAL and provides an in-browser GUI to traverse your REST API.

---
