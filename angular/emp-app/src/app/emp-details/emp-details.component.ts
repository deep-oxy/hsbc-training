import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { empData } from '../empData';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public empList:IEmployee[] = this._service.empList;

  public dataFlag = true;
  public label = "Show Table";

  constructor(private _service:EmpService) { }

  ngOnInit(): void {
  }

  public onClick() {
    if (this.dataFlag) {
      this.dataFlag = false;
      this.label = "Show List";
    } else {
      this.dataFlag = true;
      this.label = "Show Table";
    }

  }

}
