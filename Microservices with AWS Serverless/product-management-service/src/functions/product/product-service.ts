import { getDatabaseConnection } from "@libs/database-manager";
import { Product } from "src/entities/product.entity";

const create = async (product: Product): Promise<Product> => {
  const productRepository = await (await getDatabaseConnection()).getRepository(Product);

  const newProduct: Product = await productRepository.save(product).catch((e) => {
    console.error("failed to create product record", e);
    throw new Error(e); //throwing error twice is a bad decision because it repeat the same error again
  });
  return newProduct;
};

const fetch = async (productId: string): Promise<Product> => {
  const productRepository = await (await getDatabaseConnection()).getRepository(Product);

  const newProduct: Product = await productRepository.findOneBy({ id: productId }).catch((e) => {
    console.error("failed to fetch the given product", e);
    throw new Error(e); //throwing error twice is a bad decision because it repeat the same error again
  });
  return newProduct;
};

export { create, fetch };
