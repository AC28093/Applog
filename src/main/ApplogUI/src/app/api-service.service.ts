import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {AppComponent} from './app.component';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*'
  })
};
@Injectable({
  providedIn: 'root'
})
export class ApiServiceService {
  BASE_URL = 'http://lxdenvd485.dev.qintra.com:8080/ApplogViewer/';
   API_URL ='api/appLog/list/'
 id: string;
  constructor(public  httpClient: HttpClient) {
  }
getReturnId(val) {
this.id = val;
}
  getAppLogs() {
    console.log('environmenttttttttttttttt ' + this.id);
    if(this.id)
      return this.httpClient.get(this.BASE_URL+this.API_URL + this.id);
    else
      alert('Please click on IVR Applog Viewer to Reload');
  }

  getOtherInfo(columnId:string, patternValue:string){
      console.log(columnId +'/' + patternValue);
    return this.httpClient.get(this.BASE_URL+this.API_URL + this.id +'/'+columnId +'/'+patternValue);

  }
}
