import schema from "./schema";
import { handlerPath } from "@libs/handler-resolver";

const create = {
  handler: `${handlerPath(__dirname)}/create.main`,
  events: [
    {
      http: {
        method: "post",
        path: "products",
        request: {
          schemas: {
            "application/json": schema,
          },
        },
      },
    },
  ],
};

const fetch = {
  handler: `${handlerPath(__dirname)}/fetch.main`,
  events: [
    {
      http: {
        method: "get",
        path: "products/{productId}",
      },
    },
  ],
};

export { create, fetch };
