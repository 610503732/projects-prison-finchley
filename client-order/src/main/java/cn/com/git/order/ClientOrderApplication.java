package cn.com.git.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//eureka 客户端
@EnableEurekaClient
//开启feign
@EnableFeignClients
@SpringBootApplication
public class ClientOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientOrderApplication.class, args);
    }

}

