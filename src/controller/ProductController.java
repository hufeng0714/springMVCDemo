package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;
//http://127.0.0.1:8080/springmvc/addProduct.jsp
@Controller
public class ProductController {

	@RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception {
        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
	//http://127.0.0.1:8080/springmvc/jump
    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/index");
        return mav;
    }  
    //http://127.0.0.1:8080/springmvc/check
    @RequestMapping("/check")
    public ModelAndView check(HttpSession session) {
        Integer i = (Integer) session.getAttribute("count");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("count", i);
        ModelAndView mav = new ModelAndView("check");
        return mav;
    }
}
