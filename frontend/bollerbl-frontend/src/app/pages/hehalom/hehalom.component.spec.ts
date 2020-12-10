import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HehalomComponent } from './hehalom.component';

describe('HehalomComponent', () => {
  let component: HehalomComponent;
  let fixture: ComponentFixture<HehalomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HehalomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HehalomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
