package com.platzi.market.persistence;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// Como es una clase que esta iteractuando directamente con la base de datos se la debe decorar con una anotacion
// Es un estereotipo de spring framework
// @Component es una generalizacion de este tipo de anotaciones, diciendole que es un componente de spring
// @Repository con esta le estamos indicando en especifico que tipo de componente es. En este caso va iteractuar con
// la base de datos
@Repository
public class ProductoRepository implements ProductRepository {

    // Seder el control a spring que cree las instancias
    // El objeto que se va injectar debe ser un componente de spring
    // Se puede utilizar ya que de la clase que hereda es un @NoRepositoryBean
    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    // Se puede utilizar ya que el componentModel es de spring
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        // Retorna un Iterable se lo debe castear a una lista de productos
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> products = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(products));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        // Se mapea todos los productos, ya que el map devuelve un Opcional
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }
}
