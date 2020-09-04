package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private List<ShopItem> shopItems;

  public MainController() {
    shopItems = new ArrayList<>();
    shopItems.add(new ShopItem("Running Shoes", "Nike shoes for running", 100.0, 5));
    shopItems.add(new ShopItem("Printer", "For printing", 200.5, 3));
    shopItems.add(new ShopItem("Coca Cola", "Drink", 20.0, 0));
  }

  @GetMapping("/webshop")
  public String home(Model model) {
    model.addAttribute("items", shopItems);
    return "index";
  }

  @GetMapping("/only-available")
  public String availableItmes(Model model) {
    model.addAttribute("items", shopItems.stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
        .collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", shopItems.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("/contains-nike")
  public String getNike(Model model) {
    model.addAttribute("items", shopItems.stream()
        .filter(shopItem -> shopItem.getName().toLowerCase().contains("nike") ||
            shopItem.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList()));
    return "index";
  }

  @GetMapping("/average-stock")
  public String averageStock(Model model) {
    int sum = shopItems.stream().mapToInt(shopItem -> shopItem.getQuantityOfStock()).sum();
    model.addAttribute("averageStock", "Average stock: " + (double) sum / shopItems.size());
    return "averageStock";
  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model) {
    model.addAttribute("averageStock", "Most expensive item is: " + shopItems.stream()
        .reduce((price1, price2) -> price1.getPrice() > price2.getPrice() ? price1 : price2).get()
        .getName());
    return "averageStock";
  }

  @PostMapping("/search")
  public void search() {
  }
}
