package org.github.caishijun.service.impl;

import com.codingapi.tx.annotation.ITxTransaction;
import com.codingapi.tx.annotation.TxTransaction;
import org.github.caishijun.dao.UserMapper;
import org.github.caishijun.entity.User;
import org.github.caishijun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService,ITxTransaction {

    @Autowired
    private UserMapper userMapper;

    private int num = 0;

    @Override
    public List<User> list() {
        return userMapper.findAll();
    }

    @Override
    @TxTransaction
    @Transactional
    public int save() throws Exception {

        int rs = userMapper.save("mybatis-hello-2");

        if(num%2==0){
            throw new Exception("自定义异常");
        }
        System.out.println("num："+num);

        return rs;
    }
}
