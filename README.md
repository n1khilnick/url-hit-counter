# URL Hit Counter

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5`
* `Apache Tomcat/10.1.7`
*  `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:
* ### Model:
  Created UrlHit class along with data username,hitCounter,totalCounter and their constructor,getters and setters.
* ### Controller:
  Created UrlHitController class in which we created GET mappings for end-points to get the count of specific user and totalCounter.
* ### Service:
  Created UrlHitService class in which added the business logic for method getUrlHit to count the url hits for every specific user and totalCounter.

## Data Structure Used:
Used HashMap to store the <username,hitCount>.

## Project Summary:
In this spring boot application we store/track and show the number of hits to a URL endpoint for every specific user.We can also see the total hit count of all the users.
