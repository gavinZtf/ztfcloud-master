package com.gavin.sh.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: ztfcloud-master
 * @Package com.gavin.sh.discovery.eureka
 * @Description: eureka server 服务注册中心
 * @date Date : 2019年07月20日 22:48
 */
@SpringBootApplication
@EnableEurekaServer
public class ZtfCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZtfCloudEurekaApplication.class, args);
    }
}
