import { Product } from "src/entities/product.entity";
import { DataSource, EntityManager } from "typeorm";

let datasource: DataSource;

const getDatabaseConnection = async (): Promise<EntityManager> => {
  if (datasource && datasource.isInitialized) {
    console.log("Reusing existing database connection");
    return datasource.manager;
  } else {
    console.log("Initializing a new database connection");
    datasource = new DataSource({
      applicationName: "product-management-service",
      type: "postgres",
      host: process.env.DBHOSTNAME,
      port: +process.env.DBPORT,
      database: process.env.DBNAME,
      username: process.env.DBUSERNAME,
      password: process.env.DBPASSWORD,
      schema: process.env.DBSCHEMA,
      connectTimeoutMS: 30000,
      synchronize: true,
      logging: false,
      useUTC: true,
      entities: [Product],
    });

    return await datasource.initialize().then(() => {
      console.trace("new database connection is created");
      return datasource.manager;
    });
  }
};

export { getDatabaseConnection };
