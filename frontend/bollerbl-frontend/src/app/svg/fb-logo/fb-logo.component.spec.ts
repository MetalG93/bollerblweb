import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FbLogoComponent } from './fb-logo.component';

describe('FbLogoComponent', () => {
  let component: FbLogoComponent;
  let fixture: ComponentFixture<FbLogoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FbLogoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FbLogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
