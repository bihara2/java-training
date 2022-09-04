import { successResponse } from "@libs/response";
import { Product } from "src/entities/product.entity";
import { fetchAll } from "./product-service";

const fetchAllProducts = async (event) => {
  const products: Product[] = await fetchAll();
  return successResponse({ products });
};

export const main = fetchAllProducts;
