package com.lazycece.sbac.mysql.simple.service;

import com.lazycece.sbac.mysql.data.domain.User;

/**
 * @author lazycece
 * @date 2019/4/18
 */
public interface UserService {

    void addUserInfo(User user);

    User getUserInfo(String username);
}
