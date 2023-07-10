package com.naver.contoller;

import com.naver.domain.dto.ProductDto;
import com.naver.domain.entity.Product;
import com.naver.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public ModelAndView viewProduct(ModelAndView mav){
        mav.setViewName("/productView/product");
        return mav;
    }

    @GetMapping("/addproduct")
    public ModelAndView viewAddProduct(ModelAndView mav){
        mav.setViewName("/productView/addProduct");
        return mav;
    }

    @PostMapping("/addproduct")
    public void addProduct(ModelAndView mav, @ModelAttribute ProductDto productDto){
//        TODO : 조회하는거 만들고 화면 연결해주기
        System.out.println(productService.addProduct(productDto));
    }


}
