package com.gmall.fallback;

import com.gmall.entity.UmsMember;
import com.gmall.entity.UmsMemberReceiveAddress;
import com.gmall.feign.UserServiceFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component // 必须要添加，否则没用
public class UserServiceFallBackFactory implements FallbackFactory<UserServiceFeign> {

    public UserServiceFeign create(Throwable cause) {
        return new UserServiceFeign() {
            public List<UmsMember> getAllUser() {
                List<UmsMember> umsMemberList = new ArrayList<UmsMember>();
                UmsMember umsMember = new UmsMember();
                umsMember.setId("9999");
                umsMember.setBirthday(new Date());
                umsMemberList.add(umsMember);
                return umsMemberList;
            }

            public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
                return null;
            }

            public void addUserToken(String token, String memberId) {

            }

            public UmsMember login(UmsMember umsMember) {
                return null;
            }

            public UmsMember checkOauthUser(UmsMember umsCheck) {
                return null;
            }

            public void addOauthUser(UmsMember umsMember) {

            }

            public UmsMember getOauthUser(UmsMember umsMemberCheck) {
                return null;
            }

            public UmsMemberReceiveAddress getReceiveAddressById(String receiveAddressId) {
                return null;
            }
        };
    }
}
