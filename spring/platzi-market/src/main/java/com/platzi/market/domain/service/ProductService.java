package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// La clase service sirve como un negociador o intermediario entre el controlador y la capa del repositorio

@Service
public class ProductService {

    //Inyectara ProductoRepositoty que es su implementacion
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        // Con los optional se puede utilizar isPresent
        /*
        if(getProduct(productId).isPresent()) {
            productRepository.delete(productId);
            return true;
        }
        return false;
        */

        return getProduct(productId).map(product -> {
            // Se ejecuta el map si el producto existe
            productRepository.delete(productId);
            return true;
        }).orElse(false); // En el caso que el producto no exista se va retoranar false
    }
}
