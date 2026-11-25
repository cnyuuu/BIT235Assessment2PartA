// Name: Yu Leiye | Student ID: S1580814
package com.bit235.yuleiye.wikiapp.controller;

import com.bit235.yuleiye.wikiapp.service.AuthService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, Model model) {
        if (authService.authenticate(username, password)) {
            session.setAttribute("username", username.trim());
            return "redirect:/home";
        }
        model.addAttribute("error", "Invalid username or password");
        return "login";
    }

    @GetMapping("/login-error")
    public String loginErrorPage() {
        return "login-error";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}