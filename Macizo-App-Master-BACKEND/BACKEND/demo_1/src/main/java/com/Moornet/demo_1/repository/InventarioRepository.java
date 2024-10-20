package com.Moornet.demo_1.repository;

import com.Moornet.demo_1.entity.Inventario;
import org.springframework.data.repository.CrudRepository;

public interface InventarioRepository extends CrudRepository<Inventario,Integer> {
}
