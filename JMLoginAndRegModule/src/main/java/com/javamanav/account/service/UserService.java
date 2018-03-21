package com.javamanav.account.service;

import com.javamanav.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
