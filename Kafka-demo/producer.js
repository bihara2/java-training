import { Kafka } from "kafkajs";

const kafka = new Kafka({
  clientId: "sales-service",
  brokers: ["localhost:9092"],
});

const producer = kafka.producer();

const publish = async () => {
  await producer.connect().catch((e) => console.error("Cannot connect with Kafka", e));

  for (let x = 0; x < 6; x++) {
    await producer.send({
      topic: "product-sales-topic",
      messages: [{ key: x.toString(), value: JSON.stringify({ product_Name: "Product-" + x }) }],
    });
  }
};

publish().catch((e) => console.error(e));

/**
 *1. docker exec -it kafka bash
 *2. cd /opt/kafka/bin/
 *3. kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 3 --topic product-sales-topic
 */
