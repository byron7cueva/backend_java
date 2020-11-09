package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

// Utilizando Spring Data
// CrudRepository<Tipo_de_la_tabla, Tipo_del_id_de_la_tabla>
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // Utilizando query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
