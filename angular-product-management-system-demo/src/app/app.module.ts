import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { LkrFormaterPipe } from './shared/lkr-formater.pipe';
import { RatingsComponent } from './shared/ratings/ratings.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { CreateProductGuard } from './products/create-product.guard';

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    LkrFormaterPipe,
    RatingsComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgbModule,
    RouterModule.forRoot([
      { path: 'products', component: ProductsComponent },
      {
        path: 'products/:id',
        component: ProductsComponent,
        canActivate: [CreateProductGuard],
      },
      { path: 'home', component: HomeComponent },
      { path: '', redirectTo: 'home', pathMatch: 'full' },
    ]),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
