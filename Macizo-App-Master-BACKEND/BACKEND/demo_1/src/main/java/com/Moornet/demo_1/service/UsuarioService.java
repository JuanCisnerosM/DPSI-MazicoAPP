package com.Moornet.demo_1.service;


import com.Moornet.demo_1.entity.Usuario;
import com.Moornet.demo_1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor

//@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioService {

private final UserRepository userRepository;

    public Iterable<Usuario> getAllU(){
      return userRepository.findAll();
    }

  public Usuario findById(Integer idU) throws Exception {

    return userRepository.findById(idU).orElseThrow(Exception::new);
  }

  public Usuario saveNewUser(Usuario user) {
    return userRepository.save(user);
  }

  public Usuario updateUser(Integer idu, Usuario user) throws Exception {
      Usuario user1=findById(idu);
      return userRepository.save(user1);

  }
}
