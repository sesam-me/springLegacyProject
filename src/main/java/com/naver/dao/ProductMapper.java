package com.naver.dao;

import com.naver.domain.dto.AddCartDto;
import com.naver.domain.dto.ProductDto;
import com.naver.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    int addProduct(ProductDto productDto);
    List<Product> searchProduct();

    int updateProduct(Product product);
    Product findByProductSeq(int product_seq);
    int deleteProduct(int product_seq);
    int addCart(AddCartDto addCartDto);
}
