package com.gmall.manage.feign;


import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "manage-service")
public class ManageServiceFeign {


}
