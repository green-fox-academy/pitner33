package com.greenfoxacademy.basicwebshop.Controllers;

import com.greenfoxacademy.basicwebshop.ShopItem;
import com.greenfoxacademy.basicwebshop.ShopItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebShopMain {
    ShopItemRepository repository = ShopItemRepository.getInstance();

    @GetMapping("/webshop")
    public String webShopMain(Model model) {
        model.addAttribute("list", repository.getShopItemList());
        return "webShop";
    }

    @GetMapping("/webshop/only-available")
    public String webShopOnlyAvailable(Model model) {
        model.addAttribute("list", repository.getOnlyAvailable());
        return "webShop";
    }


}
