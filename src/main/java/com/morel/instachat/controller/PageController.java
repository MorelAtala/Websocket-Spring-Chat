/**
 */
package com.morel.instachat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {
        return "sockjs-message";
    }
}
