package com.example.demo.test.controller;

import com.example.demo.test.data.Order;
import com.example.demo.test.service.OrderMessagingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/8/12 22:28
 */
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderMessagingService orderMessagingService;

    @GetMapping("/current")
    public String orderForm(Model model, HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(Order order) {
        return "redirect:/";
    }
    @GetMapping("/testJms")
    public void testJms(){
        Order order = new Order();
        order.setName("刘永康");
        order.setCity("济南");
        orderMessagingService.sendOrder(order);
    }
}
