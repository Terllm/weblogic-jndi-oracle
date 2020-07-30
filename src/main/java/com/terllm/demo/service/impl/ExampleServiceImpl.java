package com.terllm.demo.service.impl;

import com.terllm.demo.mapper.ExampleMapper;
import com.terllm.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {


    @Autowired
    ExampleMapper exampleMapper;


    @Override
    public List<Map<String, String>> query() {
        return exampleMapper.query();
    }
}
