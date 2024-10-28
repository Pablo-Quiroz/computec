package com.computec.computec.dao;

import com.computec.computec.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoDao extends JpaRepository<Producto, Integer> {
    List<Producto> findAllByCategoria(String categoria);
}
