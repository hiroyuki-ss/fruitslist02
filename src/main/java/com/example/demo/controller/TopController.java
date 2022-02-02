package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Fruits;
import com.example.demo.service.FruitsService;

@Controller
public class TopController {

	@Autowired
	private FruitsService service;

	@RequestMapping("/top")
	public String getTop(Model model) {
		List<Fruits> fruits = service.getList();

//		Fruits fu = new Fruits("りんご", "1個", "500");
//		Fruits ho = new Fruits("バナナ", "2個", "600");
//		fruits.add(fu);
//		fruits.add(ho);

		model.addAttribute("fruits", fruits);
		return "top";
	}
}
