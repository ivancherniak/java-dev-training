package org.ivch.utils;

import org.ivch.model.Ingredient;
import org.ivch.model.Recipe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RecipesProviderImpl implements RecipesProvider {

    private static final int MAX_ID = 100000;
    private static final int MIN_ID = 10;
    private static final String generalRecipeNamePart = "Recipe#";
    private static final String generalIngredientNamePart = "Ingredient#";
    private static final String defaultCookingTimeInMins = "120 minutes";
    private static final String GRAMS_SUFFIX = " grams";
    private static final List<Recipe> recipes = createRecipes();

    @Override
    public List<Recipe> loadRecipes() {
        return recipes;
    }

    private static List<Recipe> createRecipes() {
        List<Recipe> recipesToReturn = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            recipesToReturn.add(mockRecipe());
        }
        return recipesToReturn;
    }

    private static Recipe mockRecipe() {
        Recipe recipe = new Recipe();
        int recipeId = getRandomInt();
        recipe.setId(recipeId);
        recipe.setName(generalRecipeNamePart + recipeId);
        recipe.setPublishingDate(new Date());
        recipe.setCookingTime(defaultCookingTimeInMins);

        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ingredients.add(mockIngredient());
        }
        recipe.setIngredients(ingredients);
        return recipe;
    }

    private static Ingredient mockIngredient() {
        Ingredient ingredient = new Ingredient();
        int ingredientId = getRandomInt();
        ingredient.setId(ingredientId);
        ingredient.setName(generalIngredientNamePart + ingredientId);
        ingredient.setCategoryId(ingredientId + 10);
        ingredient.setAmount(ingredientId + 20 + GRAMS_SUFFIX);
        return ingredient;
    }

    private static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(MIN_ID, MAX_ID);
    }

}
