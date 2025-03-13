Commands:
Run zookeeper: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Run Kafka server: .\bin\windows\kafka-server-start.bat .\config\server.properties

Create a topic: .\bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092

Create Producer: .\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

Create Consumer: .\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

Check all topics: .\bin\windows\kafka-topics.bat --bootstrap-server=localhost:9092 --list -> New version .\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --list -> Old version
