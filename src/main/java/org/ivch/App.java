package org.ivch;


import org.ivch.model.Recipe;
import org.ivch.utils.RecipesProvider;
import org.ivch.utils.RecipesProviderImpl;

import java.util.List;

public class App {

    private static final RecipesProvider recipesProvider = new RecipesProviderImpl();

    public static void main(String[] args) {
        List<Recipe> recipeList = recipesProvider.getRecipes();

    }
}
