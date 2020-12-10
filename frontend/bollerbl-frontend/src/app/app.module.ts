import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FooterComponent } from './pages/footer/footer.component';
import { RegisterComponent } from './pages/register/register.component';
import { FormsModule } from '@angular/forms';
import { FbLogoComponent } from './svg/fb-logo/fb-logo.component';
import { Error404Component } from './pages/error404/error404.component';
import { DeadPigComponent } from './svg/dead-pig/dead-pig.component';
import { RegulationsComponent } from './pages/regulations/regulations.component';
import { HehalomComponent } from './pages/hehalom/hehalom.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    FooterComponent,
    RegisterComponent,
    FbLogoComponent,
    Error404Component,
    DeadPigComponent,
    RegulationsComponent,
    HehalomComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
