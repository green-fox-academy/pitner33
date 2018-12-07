package com.greenfoxacademy.basicwebshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItemRepository {
    private List<ShopItem> shopItemList;
    private static ShopItemRepository instance;

    ShopItem nukaCola = new ShopItem("Nuka Cola", "Wasteland's favourite drink", 1.0, 5);
    ShopItem nukaColaQuantum = new ShopItem("Nuka Cola Quantum", "Radiantly refreshing drink", 50.0, 2);
    ShopItem nukaColaVictory = new ShopItem("Nuka Cola Victory", "Radiantly refreshing drink", 45.0, 0);

    private ShopItemRepository() {
        this.shopItemList = new ArrayList<>();
        shopItemList.add(nukaCola);
        shopItemList.add(nukaColaQuantum);
        shopItemList.add(nukaColaVictory);
    }

    public static ShopItemRepository getInstance() {
        if (instance == null) {
            instance = new ShopItemRepository();
        }
        return instance;
    }

    public void add(ShopItem shopItem) {
        if (shopItem != null) {
            shopItemList.add(shopItem);
        }
    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public List<ShopItem> getOnlyAvailable() {
        return shopItemList
                .stream()
                .filter(i -> i.getQty() != 0)
                .collect(Collectors.toList());
    }
}
