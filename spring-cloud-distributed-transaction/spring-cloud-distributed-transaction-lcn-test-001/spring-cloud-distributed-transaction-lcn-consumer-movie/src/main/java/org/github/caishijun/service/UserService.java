package org.github.caishijun.service;

import org.github.caishijun.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();

    int save();

}
