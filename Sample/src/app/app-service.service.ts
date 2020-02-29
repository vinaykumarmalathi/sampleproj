import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Products} from "./Products";

@Injectable({
  providedIn: 'root'
})
export class AppServiceService {

  constructor(private http: HttpClient) { }


  getProductDetails(): Observable<any> {
      return this.http.get('http://localhost:8080/product-details');
  }
}
