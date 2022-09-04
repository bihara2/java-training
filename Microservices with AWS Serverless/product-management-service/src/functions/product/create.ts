import type { ValidatedEventAPIGatewayProxyEvent } from "@libs/api-gateway";
//import { formatJSONResponse } from "@libs/api-gateway";
import { middyfy } from "@libs/lambda";
import { successResponse } from "@libs/response";
import { Product } from "src/entities/product.entity";
import { create } from "./product-service";

import schema from "./schema";

const createProduct: ValidatedEventAPIGatewayProxyEvent<typeof schema> = async (event) => {
  const product: Product = event.body as any as Product;
  const pro = await create(product);
  return successResponse({ product });
};

export const main = middyfy(createProduct);
