package com.example.myapplication;

public class Recipe {
    private String name;
    private int category;
    private String componentsList;
    private int pictureId;

    public Recipe(String name, int category, String componentsList, int pictureId) {
        this.name = name;
        this.category = category;
        this.componentsList = componentsList;
        this.pictureId = pictureId;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getComponentsList() {
        return componentsList;
    }

    public void setComponentsList(String componentsList) {
        this.componentsList = componentsList;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
