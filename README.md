the following listing shows a recipe for creating the git repository in the preceding example:

$ cd $HOME
$ mkdir config-repo
$ cd config-repo
$ git init .
$ echo info.foo: bar > application.properties
$ git add -A .
$ git commit -m "Add application.properties"


 Locating Remote Configuration Resources
The Config Service serves property sources from /{name}/{profile}/{label}, where the default bindings in the client app are as follows:

"name" = ${spring.application.name}
"profile" = ${spring.profiles.active} (actually Environment.getActiveProfiles())
"label" = "master"


curl  -H "Content-Type: application/json" http://localhost:8080/actuator/refresh -d {}

Kafka
-----
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties

curl  -H "Content-Type: application/json" http://localhost:8080/actuator/bus-refresh -d {}

https://springbootdev.com/2018/07/21/spring-cloud-config-using-git-webhook-to-auto-refresh-the-config-changes-with-spring-cloud-stream-spring-cloud-bus-and-rabbitmq-part-3/
