package cn.com.git.goods.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品服务
 */
@RestController
public class GoodsService {


    /**
     *  hello !
     * @return
     */
    @RequestMapping(value = "/goodsHello")
    public String goodsHello(){
        //测试调用
        return "商品 goods hello !" ;
    }

}
