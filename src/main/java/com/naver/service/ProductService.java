package com.naver.service;

import com.naver.dao.ProductMapper;
import com.naver.domain.dto.AddCartDto;
import com.naver.domain.dto.CartDto;
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
    public int updateProduct(Product product){return productMapper.updateProduct(product);}
    public Product findByProductSeq(int product_seq){return productMapper.findByProductSeq(product_seq);}

    public int deleteProduct(int product_seq){
        return productMapper.deleteProduct(product_seq);
    }
    public int addCart(AddCartDto addCartDto){
        return productMapper.addCart(addCartDto);
    }
    public List<CartDto> searchCart(int user_seq){return productMapper.searchCart(user_seq);}
    public int deleteCart(int cart_seq){return productMapper.deleteCart(cart_seq);}
}
