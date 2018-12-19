package cn.com.git.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//eureka 客户端
@EnableEurekaClient
@SpringBootApplication
public class ClientGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientGoodsApplication.class, args);
    }

}

