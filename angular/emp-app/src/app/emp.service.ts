import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { empData } from './empData';
import { IEmployee } from './iemployee';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private http:HttpClient) { }

  public empList=empData;

  public url="/assets/data/emp.json";

  public listAllEmployees(){
    return this.empList;
  }

  public findOneEmp(empId:Number){
    let emp=this.empList.filter(value=>{return value.empId==empId?value:null});
    return emp;
  }

  public getJsonData():Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(this.url);
  }
}
