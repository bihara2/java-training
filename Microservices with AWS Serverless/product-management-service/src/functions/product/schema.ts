export default {
  type: "object",
  properties: {
    name: { type: "string" },
    seller: { type: "string" },
    category: { type: "string" },
  },
  required: ["name", "seller", "category"],
} as const;
