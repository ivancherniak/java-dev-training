package org.ivch;

import org.ivch.model.Recipe;
import org.ivch.services.RecipeService;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    private static final RecipeService recipeService = new RecipeService();

    public static void main(String[] args) {
        List<Recipe> recipeList = recipeService.getAllRecipes();

        List<Recipe> filteredList = recipeList
                .stream()
                .filter(recipe -> recipe.getId() > 25000)
                .toList();
        Map<Integer, Recipe> filteredMap = filteredList
                .stream()
                .collect(Collectors.toMap(Recipe::getId, Function.identity()));

        System.out.println(filteredMap);

    }
}
