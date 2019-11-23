package com.someza.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.someza.ams.entities.Animal;



@Controller
public class FirstController {

	
	@GetMapping("/acceuil")
	//@ResponseBody
	public String acceuil (@RequestParam(required=false,defaultValue = "Spring Boot") String framework,
			@RequestParam(required=false,defaultValue = "1") int version,
	ModelMap monObj
			 )
	{
		
		//return "<h1 align=center>Hello Spring Boot<h1/>";
		
		
		String ecole = "POLYTECH INTL";
		String formation = "Angular & SpringBoot";
		String ch = "vous avez choisi : "+framework;
		int v = version;
		
		ArrayList<String> names = new ArrayList<>();
		
		monObj.put("msg",ch);
		monObj.put("version",v);
		
		
		names.add("Mahmoud");
		names.add("Sameh");
		names.add("Mariem");
		
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Animal ("lion",7));
		animals.add(new Animal ("elephant",2));
		animals.add(new Animal ("bird",1));
		
		
		monObj.put("animals",animals);
		
		
		monObj.put("ec",ecole);
		monObj.put("forma",formation);
		monObj.put("names",names);
		
		
		return "/first/acceuil";
	}
	
}
