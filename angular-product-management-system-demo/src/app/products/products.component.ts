import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
//import products from './data/products.json';
import { Products } from './product.model';
import { ProductService } from './product.service';

@Component({
  selector: 'pm-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss'],
})
export class ProductsComponent implements OnInit, OnDestroy {
  //
  products!: Products[];
  filteredProducts!: Products[];

  message: string = '';

  subscriber!: Subscription;

  showImage: boolean = false;
  private _nameFilter: string = '';

  set nameFilter(value: string) {
    this._nameFilter = value;
    this.filterByName();
  }

  get nameFilter(): string {
    return this._nameFilter;
  }

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.subscriber = this.productService.getAllProducts().subscribe({
      next: (data) => {
        this.products = data;
        this.filteredProducts = data;
      },
    });
  }

  ngOnDestroy(): void {
    this.subscriber.unsubscribe();
  }

  toggleImage() {
    this.showImage = !this.showImage;
  }

  filterByName() {
    this.filteredProducts = this.products.filter((product) => {
      let keyword: string = this._nameFilter.toLowerCase();
      return product.name.toLowerCase().indexOf(keyword) > -1;
    });
  }

  onMessageReceived(value: string) {
    this.message = value;
  }
}
