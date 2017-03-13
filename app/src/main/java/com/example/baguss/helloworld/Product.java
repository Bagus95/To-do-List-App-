package com.example.baguss.helloworld;

/**
 * Created by BAGUS S on 11-Mar-17.
 */

public class Product {
    private  int ImageId;
    private String title;
    private String description;

    public Product(int imageId, String title, String description) {
        ImageId = imageId;
        this.title = title;
        this.description = description;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
