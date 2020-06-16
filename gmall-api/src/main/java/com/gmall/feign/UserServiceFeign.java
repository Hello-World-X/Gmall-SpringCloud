package com.gmall.feign;

import com.gmall.entity.UmsMember;
import com.gmall.entity.UmsMemberReceiveAddress;
import com.gmall.fallback.UserServiceFallBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * restful 风格参数需要加 @PathVariable(value="") 需要指定字段
 * 其他需要添加 @RequestParam(value="") 指定字段
 */

@FeignClient(value = "user-service", fallbackFactory = UserServiceFallBackFactory.class, path = "/userService")
public interface UserServiceFeign {
    @RequestMapping(value = "/userService/getAllUser", method = RequestMethod.POST)
    List<UmsMember> getAllUser();

    @RequestMapping(value = "/userService/getReceiveAddressByMemberId", method = RequestMethod.POST)
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestParam("memberId") String memberId);

    @RequestMapping(value = "/userService/addUserToken", method = RequestMethod.POST)
    void addUserToken(@RequestParam("token") String token, @RequestParam("memberId") String memberId);

    @RequestMapping(value = "/userService/login", method = RequestMethod.POST)
    UmsMember login(UmsMember umsMember);

    @RequestMapping(value = "/userService/checkOauthUser", method = RequestMethod.POST)
    UmsMember checkOauthUser(UmsMember umsCheck);

    @RequestMapping(value = "/userService/addOauthUser", method = RequestMethod.POST)
    void addOauthUser(UmsMember umsMember);

    @RequestMapping(value = "/userService/getOauthUser", method = RequestMethod.POST)
    UmsMember getOauthUser(UmsMember umsMemberCheck);

    @RequestMapping(value = "/userService/getReceiveAddressById", method = RequestMethod.POST)
    UmsMemberReceiveAddress getReceiveAddressById(@RequestParam("receiveAddressId") String receiveAddressId);
}
