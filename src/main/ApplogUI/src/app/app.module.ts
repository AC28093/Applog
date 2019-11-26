import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import { AppComponent } from './app.component';
import { ApplogListComponent } from './applog-list/applog-list.component';
import {Ng2SmartTableModule} from 'ngx-smart-table';
import {HttpClientModule} from '@angular/common/http';

const appRoutes: Routes = [
  { path: 'appLog/list/dev1', component: ApplogListComponent },
  { path: 'appLog/list/dev2', component: ApplogListComponent },
  { path: 'appLog/list/test1', component: ApplogListComponent },
  { path: 'appLog/list/test2', component: ApplogListComponent },
  { path: 'appLog/list/test3', component: ApplogListComponent },
  { path: 'appLog/list/test4', component: ApplogListComponent },
  { path: 'appLog/list/prod', component: ApplogListComponent },
];
@NgModule({
  declarations: [
    AppComponent,
    ApplogListComponent
  ],
  imports: [
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    Ng2SmartTableModule,
    HttpClientModule
    ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
