# Spring_BOOT_REST

This is a simple Spring boot REST application. The application is developed based on a tutorial series - [Spring Boot Quick Start: by Java Brains.](https://www.youtube.com/playlist?list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x) The project is diployed on Heroku.

### DataBase 

Entities
    
    Topic                                   Course
    ---------                               ----------
    ID:String::Primary Key                  ID:String::Primary Key
    NAME:String                             NAME:String
    DESCRIPTION:String                      DESCRIPTION:String
                                            TOPIC:Object of Topic entity

`Here TOPIC in Course entity is object of Topic entity and it creates a ONE-TO-MANY relationship, where ONE Topic may have MANY Courses.`
### Mapping

*`Note: Since the project is just for practis, the url may not respond some time. USE POSTMENT TO TEST THIS REST API`*

1) To GET all the topics in the server visit fallowing url

    [https://young-bayou-11361.herokuapp.com/topics](https://young-bayou-11361.herokuapp.com/topics)

2) To POST any new topic we need to send a POST request along with some payload contaning `Content-Type` flag in header set to `application/json`.
To send/POST data, use following url (same as used to GET).

    [https://young-bayou-11361.herokuapp.com/topics](https://young-bayou-11361.herokuapp.com/topics)

        POST
        In Header:
            Content-Type = application/json
        Body:
           {
                "id": "Java",
                "name": "Java basics",
                "description": "Learn basic Java"
           }
    
3) To PUT/Modify/Update data of a topic, we need to send PUT request with payload contaning the same Id but modified data.  

    [https://young-bayou-11361.herokuapp.com/topics/Java](https://young-bayou-11361.herokuapp.com/topics/Java)

        PUT
        In Header:
            Content-Type = application/json
        Body:
            {
                "id": "Java",
                "name": "Java basics",
                "description": "Learn basic Java with example"
            }

    If you notice, *description* element of Body, we see that it's been changed from 

    `"description": "Learn basic Java" to "description": "Learn basic Java with example"`

    But id should remain same as before `"id:Java"`

4) To DELETE a topic we need to send a DELETE request, with Id of the specific element. Here we are sending topic Id as `Java.`

    [https://young-bayou-11361.herokuapp.com/topics/Java](https://young-bayou-11361.herokuapp.com/topics/Java)


