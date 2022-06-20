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

### Setup H2 data base
Download h2 database from below link and install h2 database. 
https://www.h2database.com/html/download.html
Below link contains steps to install h2 database in local
https://www.tutorialspoint.com/h2_database/h2_database_installation.htm

##**Apporach to implement URL shortener:**

Different ways are available. I have used spring boot application to generate shorten URL. I have generated shorten url in 2 ways.
1. Used hashmap to generate shorten url. For basic understanding I have used this approach.
2. Used Database to store URL information. In my case I have used h2 database. We can use any database as storage device. Installed h2 database in my local and configured data base information in application.properties file. Created controller, service , model and repository classes in order to generate shorten urls.


**##Steps to run spring boot application:**

1. Connect to h2 database by providing Driver class, URL , username and password.
2. Go to project directory ( For ex: C:\Users\Dell\git\url-shortener ) and run below command
     mvn spring-boot:run
     On succesful running will get message like Starting Shortenurl application using Java
4. Open http://localhost:8080/ in browser and will see Simple form for URL shortener
5. Enter full URL and click on Click here to get Short URL ( In this case, Triggering generate post call where checking shorten url avaialble or not for given url. If available fetching shorten url and displayed. If not available generate and store it in Data base and displayed to the user)
6. Copy shorten URL and pasted it in browser. It will redirected to original URL ( In this case, redirectToOriginalUrl get method implemented. Redirect to original url based on shorten url)
