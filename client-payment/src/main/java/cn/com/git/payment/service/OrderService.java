package cn.com.git.payment.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付服务
 */
@RestController
public class OrderService {


    /**
     *  hello !
     * @return
     */
    @RequestMapping(value = "/paymentHello")
    public String paymentHello(){
        //测试调用
        return "支付 payment hello !" ;
    }

}
