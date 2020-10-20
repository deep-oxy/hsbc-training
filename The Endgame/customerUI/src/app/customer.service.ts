import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICustomer } from './icustomer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private _url = "http://localhost:8080/";
  constructor(private http: HttpClient) { }

  public listAll(): Observable<ICustomer[]> {
    return this.http.get<ICustomer[]>(this._url + "customer/");
  }

  public findById(customerId: number): Observable<ICustomer> {
    return this.http.get<ICustomer>(this._url + "customer/find/" + customerId);
  }

  public addCustomer(customer: ICustomer): Observable<any> {
    console.log("addCustomercalled...");
    return this.http.post<any>(this._url + "customer/add", customer);
  }
}
