package com.starylwu.jenkinsweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WuYL
 * @Description:
 * @Date: Create in 2018/6/10 8:47
 * @Modified By:
 * @Copyright: 2018 www.agilestarcn.com Inc. All rights reserved.
 */
@RestController
public class DemoController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") String id){
        return id + "-----get success！";
    }
}
