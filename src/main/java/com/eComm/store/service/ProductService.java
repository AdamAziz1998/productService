package com.eComm.store.service;

import com.eComm.store.exception.ResourceNotFoundException;
import com.eComm.store.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(UUID productId) throws ResourceNotFoundException;

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsBySearch(String searchTerm);

    void createProduct(Product product);

    void updateProduct(UUID productId, Product updateProduct);

    void deleteProduct(UUID productId);
}
