import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from '../api-service.service';
@Component({
  selector: 'app-applog-list',
  templateUrl: './applog-list.component.html',
  styleUrls: ['./applog-list.component.css']
})
export class ApplogListComponent implements OnInit {
  contextInfo: string;
  stackTrace: string;
  enableSearch: boolean=false;
  showSpin: boolean=true;
  selectedItem: string='Context_Information';
  public selectItems = [
    {id: 'Context_Information', name: 'ContextInfo'},
    {id: 'Stack_Trace', name: 'StackTrace'},
    {id: 'ALARM_ID', name: 'AlarmId'},
    {id: 'VERSION', name: 'Version'},
    {id: 'MESSAGE', name: 'Message'},
    {id: 'HOST_NAME', name: 'HostName'},
    {id: 'APPLICATION_NAME', name: 'AppName'},
  ];
  settings = {};
    gridSettings = {
      noDataMessage: '',
    actions: false,
    pager: {
      display: true,
    },
        columns: {
      hostName: {
        title: 'HOST_NAME'
      },
      appName: {
        title: 'APPLICATION_NAME'
      },
      timeStamp: {
        title: 'TIME_STAMP'
      },
      version: {
        title: 'VERSION'
      },
      alarmId: {
        title: 'ALARM_ID',
        filterFunction(cell?: any, search?: string): boolean {
          if (String(cell)=== search || search === '') {
            return true;
          } else {
            return false;
          }
        },
        valuePrepareFunction: (cell, row) => {return row.alarmId}
        }
      ,
      entryType: {
        title: 'ENTRY_TYPE'
      }
      ,
      message: {
        title: 'MESSAGE'
      }
    }
  };
  appLogs$:  Object;

  constructor(public apiService:  ApiServiceService) { }


  ngOnInit() {

    this.clear();

    this.settings = this.gridSettings;
    console.log('khushii'+ this.selectedItem);
  }
  rowSelection(row) {
    this.contextInfo = row.data.stackTrace.toString();
    this.stackTrace = row.data.contextInfo.toString();
  }
  onchange(itemId: string) {
    this.selectedItem=itemId;
    console.log(this.selectedItem);
  }
  fetchInfo(inputValue: string)
  { 
    if(inputValue !== null){
    this.apiService.getOtherInfo(this.selectedItem,inputValue).subscribe(data => {
      this.appLogs$ = data;
    });
    }
    console.log(inputValue);
  }
  clear(){
  this.apiService.getAppLogs().subscribe(data => {
      this.appLogs$ = data;
      if(data !== null){
        this.enableSearch=true;
        this.showSpin=false;
      }
    });
  }
  
}





