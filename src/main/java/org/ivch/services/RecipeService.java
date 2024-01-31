package org.ivch.services;

import org.ivch.dao.RecipesDaoImpl;
import org.ivch.model.Recipe;

import java.util.List;

public class RecipeService {

    private final RecipesDaoImpl dao = new RecipesDaoImpl();

    public List<Recipe> getAllRecipes() {
        return dao.getAll();
    }

}
