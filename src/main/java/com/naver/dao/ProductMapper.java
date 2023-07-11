package com.naver.dao;

import com.naver.domain.dto.ProductDto;
import com.naver.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    int addProduct(ProductDto productDto);
    List<Product> searchProduct();
}
