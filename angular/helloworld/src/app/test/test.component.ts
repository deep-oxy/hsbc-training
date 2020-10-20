import { Component } from '@angular/core';

@Component(
    {
        selector: "test-demo",
        template: `<h1>My Test Component</h1>
        <h2> My Students Names
        <ul>
        <li *ngFor='let name of names'>{{name}}
        </ul>
        `,
        styles: []
    }
)

export class TestComponent {

    public names: String[] = ["Piyush", "Deep", "Hello", "World"];
}