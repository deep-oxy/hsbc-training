import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { IEmp } from '../iemp';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  public empList;
  constructor(private _service: EmpService) { }

  ngOnInit(): void {
  }

  public listAll() {
    this._service.listAll().subscribe(data => this.empList = data);
  }

}
