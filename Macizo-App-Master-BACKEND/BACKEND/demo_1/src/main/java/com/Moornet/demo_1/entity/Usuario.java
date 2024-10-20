package com.Moornet.demo_1.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id_usuario;

  @NonNull
  @Column(name = "username")
  private String username;

  @NonNull
  @Column(name = "email")
  private String email;

  @NonNull
  @Column(name = "password")
  private String password;

  @NonNull
  @Column(name = "edad")
  private int edad;

  @NonNull
  @Column(name = "objetivo")
  private String objetivo;


}
