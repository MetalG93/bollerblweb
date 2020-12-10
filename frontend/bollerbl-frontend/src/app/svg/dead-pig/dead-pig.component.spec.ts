import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeadPigComponent } from './dead-pig.component';

describe('DeadPigComponent', () => {
  let component: DeadPigComponent;
  let fixture: ComponentFixture<DeadPigComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeadPigComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeadPigComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
