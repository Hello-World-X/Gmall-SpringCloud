package com.gmall;

import com.gmall.ribbonconfig.RibbonRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker  // 开启 hystrix
@EnableHystrixDashboard
@SpringBootApplication
// 配置负载均衡策略
@RibbonClient(name="user-service", configuration = RibbonRuleConfig.class)
public class CloudFeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFeignServerApplication.class, args);
	}

}
