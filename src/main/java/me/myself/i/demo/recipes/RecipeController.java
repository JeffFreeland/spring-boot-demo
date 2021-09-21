package me.myself.i.demo.recipes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	
	private RecipeRepository recipeRepository;
	
	public RecipeController(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	@GetMapping("/test")
	public String getAll() {
		return "Test";
	}
	
	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes(){
		return this.recipeRepository.findAll();
	}
	
	@PostMapping("/recipes")
	public Recipe addNewRecipe(@RequestBody Recipe recipe) {
		return this.recipeRepository.save(recipe);
	}
	
}
