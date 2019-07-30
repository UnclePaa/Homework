package com.pickles.practice_13.task_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopWarehouse {
    public static void main(String[] args) {

        List<Product> goods = new ArrayList<>();
        goods.add(new Product("Milk", 1));
        goods.add(new Product("Ham", 2));
        goods.add(new Product("Bread", 3));

        System.out.println(goods);
        localDateTime(goods);

        System.out.println(goods);
    }

    // localDateTime -> setArrivedTime
    public static void localDateTime(List<Product> goods) {
        for (int i = 0; i < goods.size(); i++) {
            Product product = goods.get(i);
            LocalDateTime currentTime = LocalDateTime.now();
            product.setArrivedDate(currentTime);
        }
    }
}
