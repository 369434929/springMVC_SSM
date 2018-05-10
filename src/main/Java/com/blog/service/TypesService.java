package com.blog.service;

import com.blog.entity.Types;
import com.blog.entity.User;

public interface TypesService {

    public void insert(Types types);

    public void update(Types types);

    public void delete(String id);

    public void query(String id);
}
