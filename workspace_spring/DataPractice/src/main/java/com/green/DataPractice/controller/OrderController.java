package com.green.DataPractice.controller;
//2024.6.20 4교시

import com.green.DataPractice.vo.DeliveryVO;
import com.green.DataPractice.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    //주문정보 페이지로 이동
    @GetMapping ("/orderScreen")
    public String menuOrder(){
        return "order";
    }

    //배달정보 페이지로 이동
    @PostMapping ("/deliveryScreen")
    public String deliveryInfo(OrderVO orderVO, DeliveryVO deliveryVO){
        System.out.println();
        return "delivery";
    }

    //주문정보확인 페이지로 이동
    @PostMapping("/infoScreen")
    public String info(OrderVO orderVO, DeliveryVO deliveryVO){
        return "order_info";
    }
}
