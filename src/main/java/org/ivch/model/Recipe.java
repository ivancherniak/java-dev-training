package org.ivch.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Recipe {

    private int id;

    private String name;

    private List<Ingredient> ingredients;

    private String cookingTime;

    private Date publishingDate;

    public Recipe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && Objects.equals(name, recipe.name) && Objects.equals(ingredients, recipe.ingredients) && Objects.equals(cookingTime, recipe.cookingTime) && Objects.equals(publishingDate, recipe.publishingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ingredients, cookingTime, publishingDate);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", cookingTime='" + cookingTime + '\'' +
                ", publishingDate=" + publishingDate +
                '}';
    }
}
