package com.cristian.crudproducts.dto;

import jakarta.validation.constraints.NotBlank;

public class CategoryRequest {

    @NotBlank
    private String name;
    
    @NotBlank
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
