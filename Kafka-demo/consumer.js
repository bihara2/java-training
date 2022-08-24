import { Kafka } from "kafkajs";

const kafka = new Kafka({
  clientId: "sales-service",
  brokers: ["localhost:9092"],
});

const consumer = kafka.consumer({ groupId: "sales-team-1" });

await consumer.subscribe({ topic: "product-sales-topic", fromBeginning: true });

await consumer.run({
  eachMessage: async ({ topic, partition, message }) => {
    console.log({
      partition,
      offset: message.offset,
      value: message.value.toString(),
    });
  },
});
