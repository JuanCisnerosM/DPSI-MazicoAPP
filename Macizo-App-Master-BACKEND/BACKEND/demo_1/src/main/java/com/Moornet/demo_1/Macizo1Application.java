package com.Moornet.demo_1;

import com.Moornet.demo_1.entity.Usuario;
import com.Moornet.demo_1.repository.RecetaRepository;
import com.Moornet.demo_1.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class Macizo1Application {


  public static void main(String[] args) {
    SpringApplication.run(Macizo1Application.class, args);
  }

  @Bean
  CommandLineRunner runner(UserRepository userRepository) {
    return args -> {
      // Crear usuarios
      Usuario user1 = new Usuario("sub-zero", "email@", "123",25,"Aumentar masa muscular");
      Usuario user2 = new Usuario("Scorpion", "email2@", "321",25,"Aumentar masa muscular");
      userRepository.saveAll(Arrays.asList(user1, user2));


    };
  }


}
