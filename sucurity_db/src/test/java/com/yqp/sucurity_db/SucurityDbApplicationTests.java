package com.yqp.sucurity_db;

import com.yqp.bean.Role;
import com.yqp.bean.User;
import com.yqp.mapper.UserMapper;
import com.yqp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
class SucurityDbApplicationTests {

    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        UserDetails user = userService.loadUserByUsername("root");
        System.out.println(user);
//        User root = userMapper.loadUserByUsername("root");
//        System.out.println(root);
//        List<Role> userRolesById = userService.getUserRolesById(root.getId());
//        System.out.println(userRolesById);
//        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
//        String encode = bCryptPasswordEncoder.encode("123");
//        System.out.println(encode);
    }

}
