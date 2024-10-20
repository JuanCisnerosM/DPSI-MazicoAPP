package com.Moornet.demo_1.repository;

import com.Moornet.demo_1.entity.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Usuario,Integer> {
  }
