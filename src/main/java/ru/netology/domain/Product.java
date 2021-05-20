package ru.netology.domain;

import lombok.Data;

@Data
public class Product {
  private int id;
  private String name;
  private int price;

  public boolean matches(String search) {
    if (getName().equalsIgnoreCase(search)) {
      return true;
    }
    return false;
  }

  public Product() {
  }

  public Product(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }
}