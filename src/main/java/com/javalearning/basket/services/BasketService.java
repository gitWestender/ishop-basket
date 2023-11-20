package com.javalearning.basket.services;


import com.javalearning.basket.interfaces.IBasketService;
import com.javalearning.basket.models.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
public class BasketService implements IBasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Basket addToCard(Integer id) {
        basket.getBasketIDs().add(id);
        return basket;
    }

    @Override
    public List<Integer> getBasketInfo() {
        return basket.getBasketIDs();
    }
}
