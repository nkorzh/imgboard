# My small imageboard
___

## What is that?
Anonymous forum with reader mode, which allows to post text-messages.

                                 
## Where did you host it?
* Azure server
* Datebase at Amazon(AWS)

## Tools   
1) Kotlin
2) Spring Boot
3) Apache FreeMarker
4) IntelliJ IDEA 2020.3.1

Kotlin was chosen because of a desire to speed up development and try something new. FreeMarker allows to write macro and re-use templates.

## How to launch  
1) Create `.properties` file with following settings:
   * blog.title=Offrum
   * blog.footer.tools=Powered by Kotlin, Spring Boot & Freemarker
   * blog.footer.text=made by nkorzh
   * server.port=80
   * spring.datasource.url=_your database url_
   * spring.datasource.driver-class-name=_your db driver_
   * spring.datasource.username=_username_
   * spring.datasource.password=_password_

2) Execute <code>./gradlew kaptKotlin</code> in the root directory
3) Execute `./gradlew flywayMigrate -i` in the root directory
4) Execute `./gradlew build`
5) Launch `.jar` file with `sudo`

