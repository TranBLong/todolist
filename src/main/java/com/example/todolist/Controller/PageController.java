package com.example.todolist.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        return "index"; // Trả về file templates/index.html (nếu dùng Thymeleaf)
    }
}
