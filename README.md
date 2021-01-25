# My small imageboard
___

## Что это?
Форум, в который можно писать посты, подписанные кем угодно.

Этот проект - проба инструментов, он не претендует на роль подтверждения знания 
мной Spring Boot, Kotlin или профессионализма в БД.
                                  
## Где?
* Сервер на Azure
* База данных на сервере от Amazon(AWS)

## Инструменты   
1) Kotlin
2) Spring Boot
3) Apache FreeMarker
4) IntelliJ IDEA 2020.3.1

Kotlin был выбран ради скорости разработки и красоты кода. FreeMarker позволяет писать 
код с макросами и переиспользовать элементы, например, заголовок или footer страницы.


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

