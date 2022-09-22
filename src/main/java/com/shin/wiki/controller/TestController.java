package com.shin.wiki.controller;

import com.shin.wiki.domain.Test;
import com.shin.wiki.service.TestService;
import com.shin.wiki.domain.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    /**
     * GET, POST, PUT, DELETE
     *
     * /user?id=1
     * /user/1
     * @return
     */
    // @PostMapping
    // @PutMapping
    // @DeleteMapping
    // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    // @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }}





