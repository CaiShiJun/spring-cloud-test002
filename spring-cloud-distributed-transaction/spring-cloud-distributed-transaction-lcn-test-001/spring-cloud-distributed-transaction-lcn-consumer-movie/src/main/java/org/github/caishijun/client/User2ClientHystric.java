package org.github.caishijun.client;

import org.github.caishijun.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User2ClientHystric implements User2Client {

    @Override
    public List<User> list() {
        System.out.println("进入断路器-list。。。");
        throw new RuntimeException("list 保存失败.");
    }

    @Override
    public int save() {
        System.out.println("进入断路器-save。。。");
        throw new RuntimeException("save 保存失败.");
    }
}
