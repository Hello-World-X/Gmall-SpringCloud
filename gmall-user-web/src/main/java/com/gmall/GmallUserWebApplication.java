package com.gmall;

import com.gmall.ribbonconfig.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableFeignClients(basePackages = "com.gmall")
@EnableDiscoveryClient
@EnableCircuitBreaker  // 开启对 hystrix 熔断机制的支持
@ComponentScan(basePackages = "com.gmall")
@RibbonClient(name = "user-service", configuration = MySelfRule.class)  // 配置自己的负载均衡
@SpringBootApplication
public class GmallUserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserWebApplication.class, args);
	}

}
