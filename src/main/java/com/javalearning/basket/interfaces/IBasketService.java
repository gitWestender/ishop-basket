package com.javalearning.basket.interfaces;

import java.util.List;

public interface IBasketService {
//    Integer addProductToCard(Integer id);
    List<Integer> getProducts();
    List<Integer> addProductsToCart(List<Integer> ids);
}
