package com.terllm.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    Logger log =LoggerFactory.getLogger(ResourceController.class);



    @RequestMapping("/hello")
    public String query(){

        log.info("test");
        return "hello World";

    }






}