import { successResponse } from "@libs/response";
import { Product } from "src/entities/product.entity";
import { fetch } from "./product-service";

const fetchProducts = async (event) => {
  const product: Product = await fetch(event.pathParameters.productId); // replace this "event.path.productId" with event.pathParameters.productId
  return successResponse({ product });
};

export const main = fetchProducts;
