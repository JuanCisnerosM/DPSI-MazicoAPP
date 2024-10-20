import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Usuario } from '../model/Usuario.interface';

@Injectable({
  providedIn: 'root',
})
export class UsuarioService {
  private http = inject(HttpClient);

  GetallUs(){
    return this.http.get<Usuario[]>('http://localhost:8080/macizoapp/usuarios');
  }


}
