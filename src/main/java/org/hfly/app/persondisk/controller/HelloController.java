package org.hfly.app.persondisk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{
	@RequestMapping("/")
	public String main(HttpServletRequest request)
	{
		request.setAttribute("hello", "Hello World!");
		return "index";
	}

	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}

	@RequestMapping("/regist")
	public String regist()
	{
		return "login";
	}
}
