import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {

  public customer: ICustomer;
  public status: any = "";
  constructor(private _service: CustomerService) { }

  ngOnInit(): void {
  }

  public addCustomer(customerId: number, customerName: string, mobile: number) {
    this.customer = { customerId: customerId, customerName: customerName, mobile: mobile };
    this._service.addCustomer(this.customer).subscribe(data => this.status = data);
  }
}
