package com.yash.scaler.productservice8aug.model;


import com.yash.scaler.productservice8aug.dto.FakeStoreProductDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Integer id;

    private String title;
    private String description;
    private double price;
    private String imageURL;


    private Category category;
}
