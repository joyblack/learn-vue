package com.joy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("first")
@Controller
public class FirstController {
    /**
     * 交互
     */
    @RequestMapping("react")
    public String react(){
        return "first/react";
    }

    /**
     * 过滤器
     */
    @RequestMapping("filter")
    public String filter(){
        return "first/filter";
    }

    /**
     * 备忘录
     */
    @RequestMapping("todolist")
    public String todolist(){
        return "first/todolist";
    }

    /**
     * 百度
     */
    @RequestMapping("baidu")
    public String baidu(){
        return "first/baidu";
    }

    /**
     * 获取数据
     */
    @RequestMapping("getData")
    @ResponseBody
    public String getData(){
        return "你好啊，我是Vue";
    }

    /**
     * 计算数据
     */
    @RequestMapping("compute")
    @ResponseBody
    public Long compute(Long a, Long b){
        return a - b;
    }
}
