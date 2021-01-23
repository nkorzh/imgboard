# My small imageboard
___

## Что это?
Форум, в который можно писать посты, подписанные кем угодно.

Этот проект - проба инструментов, он не претендует на роль подтверждения знания 
мной Spring Boot, Kotlin или профессионализма в БД.
 
## Инструменты   
1) Kotlin
2) Spring Boot
3) Apache FreeMarker

Kotlin был выбран ради скорости разработки и красоты кода. FreeMarker позволяет писать 
код с макросами и переиспользовать элементы, например, заголовок или footer страницы.

## How to launch  
1) Use IntelliJ IDEA 2020.3.1
2) Execute <code>./gradlew kaptKotlin</code> in the root directory
3) Execute `./gradlew flywayMigrate -i` in the root directory 

