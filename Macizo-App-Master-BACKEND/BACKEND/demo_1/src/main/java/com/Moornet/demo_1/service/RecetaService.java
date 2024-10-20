package com.Moornet.demo_1.service;

import com.Moornet.demo_1.entity.Receta;
import com.Moornet.demo_1.repository.RecetaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

@AllArgsConstructor

public class RecetaService {
@Autowired
  private final RecetaRepository recetaRepository;

  public Iterable<Receta> getAllRecetas() {

    return recetaRepository.findAll();

  }

  public Receta findById(Integer idReceta) throws Exception {

    return recetaRepository.findById(idReceta).orElseThrow(Exception::new);
  }

  public Receta saveReceta(Receta receta) {
    return recetaRepository.save(receta);
  }



}
