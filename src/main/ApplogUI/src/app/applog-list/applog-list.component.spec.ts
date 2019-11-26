import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplogListComponent } from './applog-list.component';

describe('ApplogListComponent', () => {
  let component: ApplogListComponent;
  let fixture: ComponentFixture<ApplogListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApplogListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplogListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
