# Using Mutiny and Kafka with Wildfly

This example project accompanies the blog article
[Sending a Hello from Mutiny in Wildfly](https://pesche.schlau.ch/2023/05/15/sending-a-hello-from-mutiny-in-wildfly/).

## Compile and Run

### Start Kafka

If you don't Kafka running ready, you can run it with Docker (e.g. with Docker Desktop)

```bash
cd ~/Documents/git/wildfly-hello-mutiny

docker compose --ansi never up -d
```

### Start Wildfly

```bash
cd ~/Documents/git/wildfly-hello-mutiny

export WILDFLY_HOME=~/Documents/wildfly-28.0.0.Final
$WILDFLY_HOME/bin/standalone.sh --read-only-server-config=src/main/wildfly/standalone.xml
```

### Deploy the Application

```bash
mvn clean package
mvn wildfly:deploy

# when you've had enough
mvn wildfly:undeploy
```

## MicroProfile Reactive Messaging with Kafka

- [MicroProfile Reactive Messaging](https://github.com/eclipse/microprofile-reactive-messaging/releases)
- [SmallRye Reactive Messaging](https://smallrye.io/smallrye-reactive-messaging/)
- [SmallRye Reactive Messaging Kafka Connector](https://smallrye.io/smallrye-reactive-messaging/4.4.0/kafka/kafka/)

## Mutiny

- [SmallRye Mutiny](https://smallrye.io/smallrye-mutiny/2.1.0/)

## Wildfly 28

comes with

- MP Reactive Messaging 3.0
- MP Reactive Stream Operators 3.0
- SmallRye Reactive Messaging 4.3
- SmallRye Mutiny 2.1
- Apache Kafka Client 3.4
