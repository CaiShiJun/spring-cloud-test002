package org.github.caishijun.client;

import org.github.caishijun.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "spring-cloud-distributed-transaction-lcn-provider-user",fallback = User2ClientHystric.class)
public interface User2Client {

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    List<User> list();


    @RequestMapping(value = "/user/save",method = RequestMethod.GET)
    int save();
}
