package com.naver.dao;

import com.naver.domain.dto.*;
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
    List<CartDto> searchCart(int user_seq);
    int deleteCart(int cart_seq);
    int likeCheck(LikeCheckDto likeCheckDto);
    int manageLike(LikeUpdateDto likeUpdateDto);
}
