package org.github.caishijun.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import org.github.caishijun.client.User2Client;
import org.github.caishijun.dao.UserMapper;
import org.github.caishijun.entity.User;
import org.github.caishijun.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private User2Client user2Client;


    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public List<User> list() {
        return userMapper.findAll();
    }

    @Override
    @TxTransaction(isStart = true)
    @Transactional
    public int save() {

        int rs1 = userMapper.save("mybatis-hello-1");

        int rs2 = user2Client.save();

        return rs1+rs2;
    }
}
