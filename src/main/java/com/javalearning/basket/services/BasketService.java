package com.javalearning.basket.services;


import com.javalearning.basket.interfaces.IBasketService;
import com.javalearning.basket.models.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
public class BasketService implements IBasketService {

    @Autowired
    private Basket basket;

/*    @Override
    public Integer addProductToCard(Integer id) {
        basket.addStore(id);
        return id;
    }*/

    @Override
    public List<Integer> addProductsToCart(List<Integer> ids) {
        for (Integer id : ids) {
            basket.addStore(id);
        }
        return ids;
    }

    @Override
    public List<Integer> getProducts() {
        return basket.getBasketIDs();
    }
}
