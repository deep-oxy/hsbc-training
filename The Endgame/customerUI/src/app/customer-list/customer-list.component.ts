import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  public customerList;
  constructor(private _service: CustomerService) { }

  ngOnInit(): void {
  }

  public listAll() {
    this._service.listAll().subscribe(data => this.customerList = data);
  }
}
