import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'pm-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  private _productId: number = 0;
  constructor(private router: Router) {}

  set productId(value: number) {
    this._productId = value;
  }

  get productId() {
    return this._productId;
  }

  ngOnInit(): void {}

  viewAllProducts() {
    this.router.navigate(['/products']);
  }
}
