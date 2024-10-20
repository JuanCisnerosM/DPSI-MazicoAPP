import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadComponent: () => import('./home-scrn/home-scrn.component'),
  },
  {
    path: 'objetivo',
    loadComponent: () => import('./objetivo-scrn/objetivo-scrn.component'),
  },
  {
    path: 'recetas',
    loadComponent: () => import('./recipe-list/recipe-list.component'),
  },
  {
    path: 'Login',
    loadComponent: () => import('./logeo-macizo/logeo-macizo.component'),
  },

  {
    path: 'Salud',
    loadComponent: () => import('./salud-zone/salud-zone.component'),
  },
];
