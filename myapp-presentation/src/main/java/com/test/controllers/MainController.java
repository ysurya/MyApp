package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

   /* @RequestMapping("/search")
    public @ResponseBody Object[] searchValue(@RequestBody MainSearchValue mainSearchValue, HttpServletRequest HttpServletRequest){
        String errorCode="200";
        String result="";
        try{
             JourneyMainService journeyMainService = new JourneyMainServiceImpl();
            result = journeyMainService.checkForName(mainSearchValue.getSearchValue());
        }catch (Exception e){
            errorCode="500";
        }
       return new Object[]{errorCode,result};
    }*/

}
