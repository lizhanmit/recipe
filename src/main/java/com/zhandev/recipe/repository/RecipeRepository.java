package com.zhandev.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhandev.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
