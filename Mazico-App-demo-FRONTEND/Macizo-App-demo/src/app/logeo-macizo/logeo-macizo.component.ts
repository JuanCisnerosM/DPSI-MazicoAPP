import { Component, inject } from '@angular/core';
import { HeaderMacizoComponent } from '../header-macizo/header-macizo.component';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-logeo-macizo',
  standalone: true,
  imports: [HeaderMacizoComponent, RouterModule],
  templateUrl: './logeo-macizo.component.html',
  styleUrl: './logeo-macizo.component.css',
})
export default class LogeoMacizoComponent {
  nuevo() {
    throw new Error('Method not implemented.');
  }
}
