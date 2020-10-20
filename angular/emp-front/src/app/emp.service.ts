import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IEmp } from './iemp';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  private _url = "http://localhost:8081/";
  private _hrUrl = "http://localhost:9000/hr/emp/details";
  constructor(private http: HttpClient) { }

  public listAll(): Observable<IEmp[]> {
    return this.http.get<IEmp[]>(this._url + "emp/");
  }

  public empById(id: number): Observable<IEmp> {
    return this.http.get<IEmp>(this._url + "emp/find/" + id);
  }

  public getEmpDetails(id: number): Observable<IEmp> {
    return this.http.get<IEmp>(this._hrUrl + "?id=" + id);
  }
}
