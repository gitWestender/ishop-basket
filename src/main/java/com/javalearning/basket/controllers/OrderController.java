package com.javalearning.basket.controllers;

import com.javalearning.basket.interfaces.IBasketService;
import com.javalearning.basket.models.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final IBasketService iBasketService;

    public OrderController(IBasketService iBasketService) {
        this.iBasketService = iBasketService;
    }

    @GetMapping("/add")
    public Integer addProduct(@RequestParam int id) {
        return iBasketService.addProductToCard(id);
    }

    @GetMapping("/addItems")
    public List<Integer> addProducts(@RequestParam List<Integer> ids) {
        return iBasketService.addProductsToCart(ids);
    }

    @GetMapping("/get")
    public List<Integer> getPoducts() {
        return iBasketService.getProducts();
    }
}
