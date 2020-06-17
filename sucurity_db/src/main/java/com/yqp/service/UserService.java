package com.yqp.service;

import com.yqp.bean.Role;
import com.yqp.bean.User;
import com.yqp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userMapper.loadUserByUsername(username);

        if (user==null){
            throw new UsernameNotFoundException("用户不存在");
        }
            user.setRoles(userMapper.getUserRolesById(user.getId()));
        return user;
    }
    public List<Role> getUserRolesById(Integer id){
        return userMapper.getUserRolesById(id);
    }
}
