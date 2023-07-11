package com.naver.service;

import com.naver.dao.ProductMapper;
import com.naver.domain.dto.ProductDto;
import com.naver.domain.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public int addProduct(ProductDto productDto){
        return productMapper.addProduct(productDto);
    }

    public List<Product> searchProduct(){
        return productMapper.searchProduct();
    }
}
