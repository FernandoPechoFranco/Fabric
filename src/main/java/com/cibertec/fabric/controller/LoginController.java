package com.cibertec.fabric.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login"; // Muestra el archivo login.html
    }

    @PostMapping("/authenticate")
    public String authenticateUser(String username, String password, Model model) {
        // Validar credenciales (ejemplo básico)
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "redirect:/table";
        } else {
            model.addAttribute("error", "Credenciales inválidas");
            return "login";
        }
    }
}
