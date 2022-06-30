package main.java.com.demo.everyoneslecture.domain;

import main.java.com.demo.everyoneslecture.AbstractEvent;

public class CategoryReserved extends AbstractEventent {
    Long categoryId;
    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {this.categoryId = categoryId;}

    String categoryName;
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
