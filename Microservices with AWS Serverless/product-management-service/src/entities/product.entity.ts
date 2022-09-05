import { Column, Entity, PrimaryGeneratedColumn } from "typeorm";

@Entity("product")
export class Product {
  @PrimaryGeneratedColumn("uuid")
  id: string;
  @Column({ type: String })
  name: string;
  @Column({ type: String })
  seller: string;
  @Column({ type: String })
  category: string;
}
