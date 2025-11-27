CHANGE workbench credentials in application.properties (src-main-resources)
CREATE new schema in workbench -> "dbtimely"
IMPLEMENT entity, service, controller (classes) and repository (interface)
RUN and check in workbench if tables and its columns are created for all entities
DO Postman and try CR of CRUD

IF error upon run, try commenting out dependencies in pom.xml

post:
http://localhost:8080/user/insertUser

get:
http://localhost:8080/user/getAllUser

update:
PUT http://localhost:8080/user/updateUser/1

delete:
http://localhost:8080/user/deleteUser/1

{
  "firstname": "Gianna",
  "lastname": "Carreon",
  "username": "giannakat",
  "password": "password123",
  "email": "gianna.carreon@example.com",
  "role": "STUDENT"
}