import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

import { User } from '../../domain/User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User = {
    username: '',
    password: ''
  };

  constructor() { }

  ngOnInit(): void {
  }

  login(): void{
    console.log(this.user.username);
    console.log(this.user.password);
  }
}
