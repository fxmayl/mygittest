package com.my.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright: TODO<BR>
 * Description:TODO<BR>
 *
 * @author 方小明
 * @version 1.0.0
 * @department 产品研发中心媒体产品部
 * @date 2018-04-26 12:00
 */
@RestController
public class TestController {
    @Value("${name}")
    private int name;

    @RequestMapping("/test")
    public String test() {
        return "我正在测试!   " + name;
    }
}
