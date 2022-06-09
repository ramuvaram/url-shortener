# url-shortener
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)


Steps to run spring boot application:

1. Run spring boot application
2. Open http://localhost:8080/ in browser and will see Simple form for URL shortener
3. Enter full URL and click on Click here to get Short URL ( In this case, Triggering generate post call where checking shorten url avaialble or not for given url. If available fetching shorten url and displayed. If not available generate and store it in Data base and displayed to the user)
4. Copy shorten URL and pasted it in browser. It will redirected to original URL ( In this case, redirectToOriginalUrl get method implemented. Redirect to original url based on shorten url)
