package com.Moornet.demo_1.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Salud {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_Salud;

  @ManyToOne
  @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
  @JsonBackReference
  private Usuario usuario;

  @NonNull
  @Column(name = "peso")
  private float peso;

  @NonNull
  @Column(name = "altura")
  private float altura;

  @NonNull
  @Column(name = "imc")
  private float imc;


}
