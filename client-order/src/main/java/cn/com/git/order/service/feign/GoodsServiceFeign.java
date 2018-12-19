package cn.com.git.order.service.feign;


import cn.com.git.order.service.hystrix.GoodsServiceCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品服务 feign 接口
 *
 * @FeignClient ：
 *      value :被调用方应用名称；
 */
@FeignClient(value="client-goods",fallback = GoodsServiceCallBack.class)
public interface GoodsServiceFeign {

    /**
     *  hello !
     * @return
     */
    @RequestMapping(value = "/goodsHello")
    public String goodsHello();

}
