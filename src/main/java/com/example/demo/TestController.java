package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lipeian
 * @Email: 1023322463@qq.com
 * CreateDate: 2018/12/28
 * CreateTime: 21:23
 * Description:
 **/
@Controller
public class TestController {
    @GetMapping("/main")
    public String testIframe(){
        return "main";
    }
    @GetMapping("/frame1")
    public String frame1(){
        return "frame1";
    }
    @GetMapping("/frame2")
    public String frame2(){
        return "frame2";
    }
}
    