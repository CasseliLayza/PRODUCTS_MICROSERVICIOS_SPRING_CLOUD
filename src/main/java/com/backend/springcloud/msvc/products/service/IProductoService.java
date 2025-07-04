package com.backend.springcloud.msvc.products.service;

import com.backend.lib.mcsv.commons.entity.Product;
import com.backend.springcloud.msvc.products.exception.ResourceNotFoundException;

import java.util.List;

public interface IProductoService {
    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    Product update(Product product, Long id) throws ResourceNotFoundException;

    void delete(Long id) throws ResourceNotFoundException;

}
