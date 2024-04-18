package com.ictproject.moviemate.domain.user.controller;

import com.ictproject.moviemate.domain.user.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UserController {

	@GetMapping("/my")
	public String main(Model model, HttpSession session) {
		User user = (User) session.getAttribute("login");
		model.addAttribute("user", user);
		return "mypage";
	}

}
