// Name: Yu Leiye | Student ID: S1580814
package com.bit235.yuleiye.wikiapp.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        Object user = session.getAttribute("username");
        if (user == null) {
            return "redirect:/"; // 没登录不能进
        }
        model.addAttribute("username", user.toString());
        return "home"; // 返回 home.html
    }
}