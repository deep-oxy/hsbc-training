import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { IEmp } from '../iemp';

@Component({
  selector: 'app-hr-page',
  templateUrl: './hr-page.component.html',
  styleUrls: ['./hr-page.component.css']
})
export class HrPageComponent implements OnInit {

  public emp: IEmp = { empId: 0, name: "", city: "", salary: 0 };
  constructor(private _service: EmpService) { }

  ngOnInit(): void {
    //this.emp={empId:0,name:"",city:"",salary:0};
  }

  public getEmpDetails(id: number) {
    this._service.getEmpDetails(id).subscribe(data => this.emp = data);
  }

}
