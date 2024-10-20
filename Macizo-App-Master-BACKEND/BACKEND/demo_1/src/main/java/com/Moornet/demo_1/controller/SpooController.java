package com.Moornet.demo_1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/macizoapp/recipes")
public class SpooController {

  // Poner tu APIkey
  private final String apiK = "e5480be26e0d454f94d3c35a9a75136f";

  @GetMapping
  public ResponseEntity<String> getRecipes() {
    String url = "https://api.spoonacular.com/recipes/random?number=1&apiKey=" + apiK;

    // Realiza la solicitud HTTP con RestTemplate
    RestTemplate restTemplate = new RestTemplate();
    String response = restTemplate.getForObject(url, String.class);

    return ResponseEntity.ok(response);
  }
}
