package org.ivch.dao;

import org.ivch.model.Recipe;
import org.ivch.utils.RecipesProvider;
import org.ivch.utils.RecipesProviderImpl;

import java.util.List;
import java.util.Optional;

public class RecipesDaoImpl implements ModelDao<Recipe> {

    private final RecipesProvider recipesProvider;

    @Override
    public List<Recipe> getAll() {
        return recipesProvider.loadRecipes();
    }

    @Override
    public Optional<Recipe> getById(int id) {
        return Optional.empty();
    }

    public RecipesDaoImpl() {
        recipesProvider = new RecipesProviderImpl();
    }
}
