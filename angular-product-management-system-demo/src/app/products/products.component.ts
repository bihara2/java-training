import { Component, OnInit } from '@angular/core';
import products from './data/products.json';
import { Products } from './product.model';

@Component({
  selector: 'pm-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss'],
})
export class ProductsComponent implements OnInit {
  title: string = 'Product Management System';

  products: Products[] = products;
  filteredProducts: Products[] = products;
  message: string = '';

  showImage: boolean = false;
  private _nameFilter: string = '';

  set nameFilter(value: string) {
    this._nameFilter = value;
    this.filterByName();
  }

  get nameFilter(): string {
    return this._nameFilter;
  }

  constructor() {}

  ngOnInit(): void {}

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
