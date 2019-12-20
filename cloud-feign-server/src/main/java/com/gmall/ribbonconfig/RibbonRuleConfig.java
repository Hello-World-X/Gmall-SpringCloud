package com.gmall.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRuleConfig {

    public IRule ribbonRule(){
        // 配置随机负载均衡
    //    return new RandomRule();
        // 配置负载均衡策略为响应时长
        return new WeightedResponseTimeRule();
    }
}
