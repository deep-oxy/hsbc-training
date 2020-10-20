import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GreetService {

  private _url="http://localhost:8080/greetservice/greet/";
  constructor(private http:HttpClient) { }

  public getGreeting(name:String): Observable<any>{
    return this.http.get<any>(this._url+name);
  }
}
