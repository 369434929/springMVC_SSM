package com.blog.service;

import com.blog.entity.User;

import java.util.List;

public interface UserService {
    User getById(String id);

    public void insert(User user);

    public void update(User user);

    public void delete(String id);

    public void query(String id);

    public User login(String user,String pas);

    public List<User> getUser();

}
