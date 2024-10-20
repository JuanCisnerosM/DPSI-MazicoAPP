package com.Moornet.demo_1.controller;
import com.Moornet.demo_1.entity.Usuario;
import com.Moornet.demo_1.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/macizoapp/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
@RestController

@AllArgsConstructor
public class UserController {


  private final UsuarioService usuarioService;

  @GetMapping
  public Iterable<Usuario> getUserList() {
    return usuarioService.getAllU();
  }

  @GetMapping("{id}")
  public Usuario getI(Integer id) throws Exception {
   return usuarioService.findById(id);
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public Usuario newUser(@RequestBody Usuario user) {
    return usuarioService.saveNewUser(user);
  }

  @PutMapping("{id}")
  public Usuario updateUser(@PathVariable Integer id_usuario, @RequestBody Usuario user) throws Exception {
      return usuarioService.updateUser(id_usuario,user);
  }

}
