package com.blog.service.impl;

import com.blog.entity.Types;
import com.blog.mapping.TypesMapper;
import com.blog.service.TypesService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;
@Service("typesService")
@Transactional
public class TypesServiceImpl implements TypesService {
    @Resource(name = "typesMapper")
    private TypesMapper typesMapper;

    @Override
    public void insert(Types types) {
        typesMapper.insert(types);
    }

    @Override
    public void update(Types types) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void query(String id) {

    }



}
