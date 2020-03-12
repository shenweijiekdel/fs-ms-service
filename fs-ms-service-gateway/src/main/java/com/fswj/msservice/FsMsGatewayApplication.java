package com.fswj.msservice;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(annotationClass = Mapper.class,basePackages = {"com.fswj.msservice"})
public class FsMsGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FsMsGatewayApplication.class, args);
    }

}
