package com.naver.contoller;

import com.naver.domain.dto.*;
import com.naver.domain.entity.Product;
import com.naver.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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

//    @PostMapping("/updateproduct")
//    public void updateProduct(@ModelAttribute UpdateProductDto updateProductDto) {
//        System.out.println(updateProductDto);
//    }


    @PostMapping("/updateproduct")
    public ModelAndView updateProduct(ModelAndView mav, @ModelAttribute Product product){
        System.out.println(product);
        int updateResult = productService.updateProduct(product);

        if(updateResult == 1){
            mav.setViewName("redirect:/searchproduct");
        }
        return mav;
    }



    @GetMapping("/deleteproduct/{product_seq}")
    public ModelAndView deleteProduct(ModelAndView mav, @PathVariable("product_seq")int product_seq){
        int deleteResult = productService.deleteProduct(product_seq);
        System.out.println(deleteResult);
        if(deleteResult == 1){
            mav.setViewName("redirect:/searchproduct");
        }
        return mav;
    }


//    TODO 1.GET : 장바구니 추가 누르면(완)  2.POST : 장바구니 jsp에 장바구니 목록 담기고 보여줌.
    @GetMapping("/addcart/{product_seq}")
    public ModelAndView addCart(ModelAndView mav, @PathVariable("product_seq") int product_seq, HttpSession session){
        AddCartDto addCartDto = new AddCartDto((Integer) session.getAttribute("user_seq"), product_seq);
        int result = productService.addCart(addCartDto);
        if(result == 1){
            mav.setViewName("redirect:/searchproduct");
        }
        return mav;
    }

    @GetMapping("/cart")
    public ModelAndView cartList(ModelAndView mav, HttpSession session){
        List<CartDto> cartlist = productService.searchCart((Integer) session.getAttribute("user_seq"));
        mav.addObject("cartlist",cartlist);
        mav.setViewName("/productView/cart");

        return mav;
    }

    @GetMapping("/deletecart/{cart_seq}")
    public ModelAndView deleteCart(ModelAndView mav, @PathVariable("cart_seq") int cart_seq){
        int result = productService.deleteCart(cart_seq);
        if(result == 1){
            mav.setViewName("redirect:/cart");
        }
        return mav;
    }

    @PostMapping("/like")
    public ModelAndView likeCheck(ModelAndView mav,@RequestParam("product_seq")int product_seq, HttpSession session){
        LikeCheckDto likeCheckDto = new LikeCheckDto((Integer) session.getAttribute("user_seq"),product_seq);
        // 내가 좋아요 눌럿는가? 눌럿으면 1 아니면 0
        int result = productService.likeCheck(likeCheckDto);

        LikeUpdateDto likeUpdateDto = new LikeUpdateDto((Integer) session.getAttribute("user_seq"), product_seq, result);

        int result2 = productService.manageLike(likeUpdateDto);

        if(result2 == 1) {
            mav.setViewName("redirect:/searchproduct");
        }


        return mav;
    }

}
