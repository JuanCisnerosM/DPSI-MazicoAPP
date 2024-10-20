package com.Moornet.demo_1.controller;

import com.Moornet.demo_1.entity.Receta;
import com.Moornet.demo_1.service.RecetaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/macizoapp/recetas")
@RestController

@AllArgsConstructor
public class RecetaController {

  private final RecetaService recetaService;

  @GetMapping
  public Iterable<Receta> getAllPosts() {
    return recetaService.getAllRecetas();
  }

  @GetMapping("{id}")
  public Receta getI(@PathVariable Integer id) throws Exception {
    return recetaService.findById(id);
  }
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public Receta createReceta(@RequestBody Receta receta) {
    return recetaService.saveReceta(receta);
  }


}
