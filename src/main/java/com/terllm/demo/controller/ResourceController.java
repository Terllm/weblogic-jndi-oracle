package com.terllm.demo.controller;

import com.terllm.demo.service.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ResourceController {

    Logger log =LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    ExampleService exampleService;


    @RequestMapping("/hello")
    public List<Map<String, String>> query(){

        log.info("test");
        return exampleService.query();

    }






}