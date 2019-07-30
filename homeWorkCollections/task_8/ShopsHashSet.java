package com.pickles.practice_12.task_8;

import java.util.HashSet;
import java.util.Objects;

толь//+
public class ShopsHashSet {
    public static void main(String[] args) {
        HashSet<Shop> shops = new HashSet<>();
        Shop preston1 = new Shop("Preston", 1);
        Shop preston2 = new Shop("Preston", 1);
        Shop preston3 = new Shop("Preston", 1);
        Shop preston4 = new Shop("Preston", 2);

        shops.add(preston1);
        shops.add(preston2);
        shops.add(preston3);
        shops.add(preston4);
        System.out.println(shops);
    }
}

class Shop {
    private String name;
    private Integer id;

    public Shop(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Shop " + name + " with id " + id;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Shop shop = (Shop) object;
        return name == shop.name;
    }

    public int hashCode() {
        return Objects.hash(name, id);
    }
}
