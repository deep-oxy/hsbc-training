import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private _url="http://localhost:8080/";
  
  constructor() { }
}
