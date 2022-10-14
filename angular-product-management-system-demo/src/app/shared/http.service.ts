import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Products } from '../products/product.model';

@Injectable({ providedIn: 'root' })
export class HttpService {
  private getAllProductsUrl: string = 'http://localhost:3000/products';
  constructor(private http: HttpClient) {}

  getAllProducts(): Observable<Products[]> {
    return this.http.get<Products[]>(this.getAllProductsUrl);
  }
}
