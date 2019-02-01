package com.xcy.microserviceeureka6868;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明这是一个Eureka server 服务
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEureka6868Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEureka6868Application.class, args);
    }

}

