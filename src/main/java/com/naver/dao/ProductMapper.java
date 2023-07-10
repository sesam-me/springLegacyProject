package com.naver.dao;

import com.naver.domain.dto.ProductDto;
import com.naver.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

    int addProduct(ProductDto productDto);
}
