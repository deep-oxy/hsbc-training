import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { empData } from '../empData';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-id-list',
  templateUrl: './emp-id-list.component.html',
  styleUrls: ['./emp-id-list.component.css']
})
export class EmpIdListComponent implements OnInit {

  public empList:IEmployee[] = this._service.empList;

  public dataFlag = false;
  public label="List All Employees";

  public emp;

  constructor(private _service: EmpService) { }

  ngOnInit(): void {
  }

  public findEmp(id: Number) {
    this.emp = this._service.findOneEmp(id);
    console.log(this.emp);
  }

  public listAllEmp() {
    console.log(this.empList);
    if (this.dataFlag) {
      this.dataFlag = false;
      this.label = "List All Employees";
    }
    else {
      this.dataFlag = true;
      this.label = "Hide All Employees";
    }

    // console.log(this._service.listAllEmployees());
  }

}
