package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Car;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String main(Model model) {

		List<String> carmodellist = new ArrayList<String>();

		carmodellist.add("tenjikaione");
		carmodellist.add("tenjikaitwo");
		carmodellist.add("tenjikaithree");
		carmodellist.add("tenjikaifour");
		carmodellist.add("tenjikaifive");
		carmodellist.add("tenjikaisix");
		carmodellist.add("tenjikaiseven");
		carmodellist.add("tenjikaieight");
		carmodellist.add("tenjikainine");
		carmodellist.add("tenjikaiten");
		carmodellist.add("tenjikaieleven");
		carmodellist.add("tenjikaitwelve");
		carmodellist.add("tenjikaithirteen");


		model.addAttribute("car", new Car());

		model.addAttribute("carmodellist", carmodellist);
		return "index";
	}

	@PostMapping
	public String save(Car car, Model model) {
		model.addAttribute("car", car);
		return "saved";
	}

}
