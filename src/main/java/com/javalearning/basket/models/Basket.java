package com.javalearning.basket.models;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Integer> basketIDs = new ArrayList<>();

    public List<Integer> addStore(Integer items) {
        basketIDs.add(items);
        return basketIDs;
    }

    public List<Integer> getBasketIDs() {
        return new ArrayList<>(basketIDs);
    }
}
