import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule,Routes } from '@angular/router';
import { PostsComponent } from '../posts/posts.component';
import { PostByIdComponent } from '../post-by-id/post-by-id.component';

const routes:Routes=[
  {path:"posts",component:PostsComponent},
  {path:"postbyid",component:PostByIdComponent}
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
