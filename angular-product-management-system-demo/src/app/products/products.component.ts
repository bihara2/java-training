import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'pm-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss'],
})
export class ProductsComponent implements OnInit {
  title: string = 'Product Management System';
  constructor() {}

  ngOnInit(): void {}
}
