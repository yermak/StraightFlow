package com.strightflow.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yermak on 30/4/14.
 */

@Controller

public class PageController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/namespace")
    public String namespace(@RequestParam(value = "view", required = false, defaultValue = "list") String view, Model model) {
        model.addAttribute("name", view);
        return "namespace";
    }


}
