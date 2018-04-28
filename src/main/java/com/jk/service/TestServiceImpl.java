package com.jk.service;

import com.jk.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserDao userDao;

    @Override
    public String haha(String name) {
        String  result="how ary you"+name;
        return result;
    }

    @Override
    public List getUser() {
        return userDao.findAll();
    }
}
