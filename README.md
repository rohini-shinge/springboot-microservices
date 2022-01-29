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

*Factors*
URI Pollution
Misuse of HTTP Headers
Caching
Can we execute the request on the browser?
API Documentation
No Perfect Solution

*More*
https://www.mnot.net/blog/2011/10/25/web_api_versioning_smackdown
http://urthen.github.io/2013/05/09/ways-to-version-your-api/
http://stackoverflow.com/questions/389169/best-practices-for-api-versioning
http://www.lexicalscope.com/blog/2012/03/12/how-are-rest-apis-versioned/
https://www.3scale.net/2016/06/api-versioning-methods-a-brief-reference/
