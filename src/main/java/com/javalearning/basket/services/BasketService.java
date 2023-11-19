package com.javalearning.basket.services;


import com.javalearning.basket.interfaces.IBasketService;
import com.javalearning.basket.models.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketService implements IBasketService {

    private final List<Integer> productID;

    public BasketService(List<Integer> productID) {
        this.productID = productID;
    }

    @Override
    public Basket addProduct(Integer id) {
        Basket temp = new Basket(id);
        productID.add(temp.getProductID());
        return temp;
    }

    @Override
    public List<Integer> getBasketInfo() {
        return productID;
    }
}
