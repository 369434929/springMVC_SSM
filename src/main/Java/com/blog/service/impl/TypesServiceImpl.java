package com.blog.service.impl;

import com.blog.entity.Types;
import com.blog.entity.User;
import com.blog.mapping.TypesMapper;
import com.blog.service.TypesService;
import com.blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @Test
    public static void main (String args[]){
        String [] stringarr=new String[] {"生活日记","电脑技术"};
        int number =1;
        for (int i = 0 ;i<stringarr.length; i++){
            Types types = new Types();
            types.setTypeId(UUID.randomUUID().toString().replaceAll("-", ""));
            types.setType(number);
            types.setTypeExplain(stringarr[i]);
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            TypesService typesService = (TypesService) context.getBean("typesService");
            typesService.insert(types);
        }
    }

}
