import { APP_INITIALIZER, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { initializeKeycloak } from './auth/app.init';

import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { LkrFormaterPipe } from './shared/lkr-formater.pipe';
import { RatingsComponent } from './shared/ratings/ratings.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { CreateProductGuard } from './products/create-product.guard';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { AuthGuard } from './auth/keycloak.guard';

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
    HttpClientModule,
    NgbModule,
    RouterModule.forRoot([
      {
        path: 'product',
        component: ProductsComponent,
        canActivate: [AuthGuard],
      },
      { path: 'products', component: ProductsComponent },
      {
        path: 'products/:id',
        component: ProductsComponent,
        canActivate: [CreateProductGuard],
      },
      { path: 'home', component: HomeComponent },
      { path: '', redirectTo: 'home', pathMatch: 'full' },
    ]),
    KeycloakAngularModule,
  ],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: initializeKeycloak,
      multi: true,
      deps: [KeycloakService],
    },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
