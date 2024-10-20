import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HeaderMacizoComponent } from "../header-macizo/header-macizo.component";

@Component({
  selector: 'app-objetivo-scrn',
  standalone: true,
  imports: [RouterModule, HeaderMacizoComponent],
  templateUrl: './objetivo-scrn.component.html',
  styleUrl: './objetivo-scrn.component.css',
})
export default class ObjetivoScrnComponent {}
