import { Component } from '@angular/core';
import {ApiServiceService} from './api-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  envUsed: string;
  public envs = [
    {id: 'dev1', name: 'Dev1'},
    {id: 'dev2', name: 'Dev2'},
    {id: 'test1', name: 'Test1'},
    {id: 'test2', name: 'Test2'},
    {id: 'test3', name: 'Test3'},
    {id: 'test4', name: 'Test4'},
    {id: 'prod', name: 'Prod'},

  ];
  constructor(private service: ApiServiceService) { }
  onclick(envid: string, envName: string) {
this.service.getReturnId(envid);
this.envUsed=envName;
console.log(envid);
  }
}




