export default {
  ProductCreate: {
    Type: "AWS::SNS::Topic",
    Properties: {
      TopicName: "product-create-topic-${sls:stage}",
    },
  },
};
