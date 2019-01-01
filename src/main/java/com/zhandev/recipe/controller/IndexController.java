package com.zhandev.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhandev.recipe.repository.CategoryRepository;
import com.zhandev.recipe.repository.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}


	@RequestMapping({"", "/", "index", "index.html"})
	public String getIndexPage() {
		
		System.out.println(categoryRepository.findByDescription("Italian").get().getId());
		System.out.println(unitOfMeasureRepository.findByDescription("Pinch").get().getId());
		
		return "index";
	}
}
