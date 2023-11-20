package com.javalearning.basket.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Integer> basketIDs;

    public Basket(List<Integer> basketIDs) {
        this.basketIDs = basketIDs;
    }

    public List<Integer> getBasketIDs() {
        return basketIDs;
    }
}
