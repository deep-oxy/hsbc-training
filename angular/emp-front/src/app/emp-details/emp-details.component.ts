import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { IEmp } from '../iemp';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public emp: IEmp = { empId: 0, name: "", city: "", salary: 0 };
  constructor(private _service: EmpService) { }

  ngOnInit(): void {
    //this.emp={empId:0,name:"",city:"",salary:0};
  }

  public findEmp(id: number) {
    this._service.empById(id).subscribe(data => this.emp = data);
  }

}
