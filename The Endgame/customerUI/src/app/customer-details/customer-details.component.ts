import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  public customer;
  constructor(private _service: CustomerService) { }

  ngOnInit(): void {
    this.customer = { customerId: 0, name: "", mobile: 0 };
  }

  public findById(customerId: number) {
    this._service.findById(customerId).subscribe(data => this.customer = data);
  }
}
