package com.cylinder.contacts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("contacts")
public class ContactController {
    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "This is a contact response!";
    }
}
