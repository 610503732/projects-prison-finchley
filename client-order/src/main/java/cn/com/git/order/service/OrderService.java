package cn.com.git.order.service;

import cn.com.git.order.service.feign.GoodsServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单服务
 */
@RestController
public class OrderService {

    @Autowired
    private GoodsServiceFeign goodsServiceFeign ;

    /**
     *  hello !
     * @return
     */
    @RequestMapping(value = "/orderHello")
    public String orderHello(){
        //测试调用
        return "订单 order hello ! and "+ goodsServiceFeign.goodsHello() ;
    }

}
