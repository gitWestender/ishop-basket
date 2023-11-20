package com.javalearning.basket.controllers;

import com.javalearning.basket.interfaces.IBasketService;
import com.javalearning.basket.models.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final IBasketService iBasketService;

    public BasketController(IBasketService iBasketService) {
        this.iBasketService = iBasketService;
    }

    @GetMapping("/add")
    public Basket addProduct(int id) {
        return iBasketService.addToCard(id);
    }

    @GetMapping("/get")
    public List<Integer> getBasket() {
        return iBasketService.getBasketInfo();
    }
}
