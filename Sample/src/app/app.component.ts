import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Route} from "@angular/router";
import {AppServiceService} from "./app-service.service";
import {Products} from "./Products";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Sample';

  constructor(private service: AppServiceService) {}


  products: Products[] = [];

  getProductDetails(){

      this.service.getProductDetails().subscribe( response => {

        this.products = <Products[]> response;

        console.log(this.products);
        }


      );

  }

}
