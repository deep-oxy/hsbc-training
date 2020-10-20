import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <div [hidden]="isDivHidden">
    <h1 [id]="compId">{{title}}</h1>
    <hr>
    <h2>{{8+9}}</h2>
    <h2 [class.text-danger]="hasError">My name is {{"Piyush".toUpperCase()}}</h2>
    <h2 [class]="textStyle">My name is {{"Piyush".toUpperCase()}}</h2>
    <input type="text" name="uid" [disabled]="isDisabled"/>
    <button (click)="changeState()">Toggle</button>
    </div>
    <br>
    <button (click)="showHide()">{{label}}</button>

  `,
  styles: [`
  .text-danger {color:red}
  .text-success {color:green}
  `
  ]
})
export class TestComponent implements OnInit {

  public title = "Learning Bindings";

  public name: String = "Hi";
  public compId = "myId";
  public isDivHidden=false;
  public label="Hide";
  public textStyle="text-danger"
  public hasError=false;

  public isDisabled = true;
  constructor() { }

  ngOnInit(): void {
  }

  public changeState() {
    if (this.isDisabled == false) {
      this.isDisabled = true;
    } else {
      this.isDisabled = false;
    }
  }
    public showHide() {
      if (this.isDivHidden == false) {
        this.isDivHidden = true;
        this.label="Show";
      } else {
        this.isDivHidden = false;
        this.label="Hide";
      }

  }

}
