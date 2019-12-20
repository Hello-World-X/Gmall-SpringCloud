package com.gmall.user.controller;

import com.gmall.entity.UmsMember;
import com.gmall.entity.UmsMemberReceiveAddress;
import com.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userService")
public class UserServiceController {

    @Resource(name="userServiceImpl")
    private UserService userService;

    @RequestMapping("/getAllUser")
    List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("/getReceiveAddressByMemberId")
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        return userService.getReceiveAddressByMemberId(memberId);
    }

    @RequestMapping("/addUserToken")
    void addUserToken(String token, String memberId){
        userService.addUserToken(token, memberId);
    }

    @RequestMapping("/login")
    UmsMember login(UmsMember umsMember){
        return userService.login(umsMember);
    }

    @RequestMapping("/checkOauthUser")
    UmsMember checkOauthUser(UmsMember umsCheck){
        return checkOauthUser(umsCheck);
    }

    @RequestMapping("/addOauthUser")
    void addOauthUser(UmsMember umsMember){
        userService.addOauthUser(umsMember);
    }

    @RequestMapping("/getOauthUser")
    UmsMember getOauthUser(UmsMember umsMemberCheck){
        return userService.getOauthUser(umsMemberCheck);
    }

    @RequestMapping("/getReceiveAddressById")
    UmsMemberReceiveAddress getReceiveAddressById(String receiveAddressId){
        return getReceiveAddressById(receiveAddressId);
    }
}
