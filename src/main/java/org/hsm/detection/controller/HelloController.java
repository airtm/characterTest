package org.hsm.detection.controller;

import org.hsm.detection.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(@ModelAttribute(value = "message") Message message, ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        map.addAttribute("sex", 0);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute(value = "message") Message message, ModelMap map) {

        map.addAttribute("type", "0");

        return "index";

    }

    @ResponseBody
    @RequestMapping("/t")
    public String test() {
        return "index";
    }

}