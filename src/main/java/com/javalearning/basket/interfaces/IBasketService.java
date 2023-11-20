package com.javalearning.basket.interfaces;

import com.javalearning.basket.models.Basket;

import java.util.List;

public interface IBasketService {
    Basket addToCard(Integer id);
    List<Integer> getBasketInfo();
}
