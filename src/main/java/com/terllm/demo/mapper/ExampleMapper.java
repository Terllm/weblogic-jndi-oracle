package com.terllm.demo.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ExampleMapper {


    public List<Map<String, String>> query();


}
