package cn.com.git.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//eureka 客户端
@EnableEurekaClient
@SpringBootApplication
public class ClientPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientPaymentApplication.class, args);
    }

}

