package com.yqp.mapper;

import com.yqp.bean.Role;
import com.yqp.bean.User;

import java.util.List;

public interface UserMapper {

    User loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);
}
