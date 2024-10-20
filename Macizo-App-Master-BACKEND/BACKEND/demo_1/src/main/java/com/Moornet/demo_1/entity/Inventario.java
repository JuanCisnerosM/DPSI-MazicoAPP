package com.Moornet.demo_1.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Inventario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_Inventario;


  @NonNull
  @Column(name = "nombre_receta")
  private String nombre_receta;

  @NonNull
  @Column(name = "cantidad")
  private int cantidad;

  @ManyToOne
  @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
  @JsonBackReference
  private Usuario usuario;

}
