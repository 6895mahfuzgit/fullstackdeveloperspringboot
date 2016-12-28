package com.fullstackdeveloperspringboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 28-Dec-16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){

        return "index";
    }
}
