import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import { AppComponent } from './app.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { ChildComponent } from './child/child.component';
import { EmpIdListComponent } from './emp-id-list/emp-id-list.component';
import { EmpService } from './emp.service';
import { EmpJsonComponent } from './emp-json/emp-json.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpDetailsComponent,
    ChildComponent,
    EmpIdListComponent,
    EmpJsonComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [EmpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
