import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  template: `
    <h1>{{title|uppercase}}</h1>
    <h1>{{num1|percent:"3.2-6"}}</h1>
    <h1>{{num1|percent:"2.2-3"}}</h1>
    <h1>{{num1|percent:"2.2"}}</h1>
    <h1>Today is {{today}}</h1>
    <h1>Today is {{today|date}}</h1>
    <h1>Today is {{today|date:"shortDate"}}</h1>
    <h1>Today is {{today|date:"hh:mm:ss"}}</h1>
    
  `,
  styles: [
  ]
})
export class PipesComponent implements OnInit {

  public title="Learning Pipes";
  public num1:Number=0.259987;
  public today=Date.now();
  constructor() { }

  ngOnInit(): void {
  }

}
