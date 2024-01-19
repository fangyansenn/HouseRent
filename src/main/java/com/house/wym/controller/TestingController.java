package com.house.wym.controller;



import com.house.wym.service.IHouserService;
import com.house.wym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.house.wym.service.ITestingService;
import org.springframework.web.bind.annotation.ResponseBody;


    @Controller
    public class TestingController {

        private ITestingService iTestingService;
        @RequestMapping("/testing")
        @ResponseBody
        public String testing(){

            return "datas";
        }

 }
