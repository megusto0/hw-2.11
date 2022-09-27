package com.example.hw_2_11.service;

import com.example.hw_2_11.component.Basket;
import com.example.hw_2_11.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;
    private final Map<Integer, Item> items;

    public StoreService(Basket basket) {
        this.basket = basket;
        this.items = Map.of(
                1, new Item(1, "Книга", 750),
                2, new Item(2, "Ручка", 19),
                3, new Item(3, "Тетрадь", 49)
        );
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(id -> items.get(id))
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList())
        );
    }

    public List<Item> get() {
        return basket.get();
    }
}
