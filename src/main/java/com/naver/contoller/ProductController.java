package com.naver.contoller;

import com.naver.domain.dto.ProductDto;
import com.naver.domain.dto.UpdateProductDto;
import com.naver.domain.entity.Product;
import com.naver.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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
    public ModelAndView addProduct(ModelAndView mav, @ModelAttribute ProductDto productDto){
//        TODO : 조회하는거 만들고 화면 연결해주기
        int result = productService.addProduct(productDto);

        if(result == 1){
            mav.setViewName("redirect:/searchproduct");
        }
        return mav;
    }

    @GetMapping("/searchproduct")
    public ModelAndView searchProduct(ModelAndView mav){
        List<Product> productList = productService.searchProduct();

        mav.addObject("productList",productList);

        mav.setViewName("/productView/searchProduct");
        return mav;
    }

//    TODO 수정 1.get:입력했던 값보여주고  2.값입력 후 post:수정
//    TODO 삭제 1.post : 해당 값 삭제버튼 누르면 삭제 -> 삭제 후 상품리스트(searchProduct) 보여주기


    @GetMapping("/updateproduct/{product_seq}")
    public ModelAndView viewUpdateProduct(ModelAndView mav, @PathVariable("product_seq") int product_seq){
        Product product = productService.findByProductSeq(product_seq);
        // "product"는 updateProduct.jsp에서 value="${product.name} 이렇게 변수명으로 사용된다.
        mav.addObject("product" ,product);
        mav.setViewName("/productView/updateProduct");
        return mav;
    }

    @PostMapping("/updateproduct")
    public void updateProduct(@ModelAttribute UpdateProductDto updateProductDto) {
        System.out.println(updateProductDto);
    }


//    @PostMapping("/changeProduct")
//    public ModelAndView updateProduct(ModelAndView mav, @ModelAttribute Product product){
//        System.out.println(product);
//        int updateResult = productService.updateProduct(product);
//
//        if(updateResult == 1){
//            mav.setViewName("redirect:/searchproduct");
//        }
//        return null;
//    }



//    @PostMapping("/deleteproduct/{product_seq}")
//    public ModelAndView deleteProduct(ModelAndView mav, @PathVariable("product_seq")int product_seq){
//
//        mav.setViewName("/");
//    }
}
