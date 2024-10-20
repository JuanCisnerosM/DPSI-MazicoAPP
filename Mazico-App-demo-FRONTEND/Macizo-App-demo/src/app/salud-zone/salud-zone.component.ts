import { Component } from '@angular/core';
import { HeaderMacizoComponent } from '../header-macizo/header-macizo.component';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-salud-zone',
  standalone: true,
  imports: [HeaderMacizoComponent,RouterModule],
  templateUrl: './salud-zone.component.html',
  styleUrl: './salud-zone.component.css',
})
export default class SaludZoneComponent {}
