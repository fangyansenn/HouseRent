package com.house.wym.controller;



import com.house.wym.entity.Testing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.house.wym.service.ITestingService;
import org.springframework.web.bind.annotation.ResponseBody;


    @Controller
    public class TestingController {

        @Autowired
        private ITestingService service;
        @RequestMapping("/addtesting")
        @ResponseBody
        public String testing(Testing testing){
            int b = 0;
            int a = service.addtesting(testing);

            return "通了通了，绿帽哥的py通了";
        }

 }
