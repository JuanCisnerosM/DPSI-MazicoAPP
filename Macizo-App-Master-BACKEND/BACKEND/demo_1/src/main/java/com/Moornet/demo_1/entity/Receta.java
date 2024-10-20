package com.Moornet.demo_1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Receta {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idReceta;

  @NonNull
  @Column(name = "nombre")
  private String nombre;

  @NonNull
  @Column(name = "instrucciones")
  private String instrucciones;

  @NonNull
  @Column(name = "calorias")
  private float calorias;

  @NonNull
  @Column(name = "ingredientes")
  @ElementCollection
  private List<String> ingredientes; // Lista de ingredientes

  @NonNull
  @Column(name = "imagenUrl")
  private String imagenUrl; // URL de la imagen de la receta


  @NonNull
  @ManyToOne
  @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
  @JsonBackReference
  private Usuario Usuario;

}
