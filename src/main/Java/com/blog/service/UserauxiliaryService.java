package com.blog.service;

import com.blog.entity.User;

public interface UserauxiliaryService {
    User getById(String id);

    public void add(User user);

    public void update(User user);

    public void delete(String id);

    public void query(String id);
}
