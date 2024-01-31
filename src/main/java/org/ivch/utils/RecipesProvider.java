package org.ivch.utils;

import org.ivch.model.Recipe;

import java.util.List;

public interface RecipesProvider {
    List<Recipe> loadRecipes();

}
