package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Keyboard", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(109, "Watch", "Accessories"),
            new Product(103, "Mouse", "Electronics"),
            new Product(108, "Bag", "Fashion")
        };

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int searchId = 109;

        System.out.println("🔍 Linear Search Result:");
        Product result1 = linearSearch(products, searchId);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n🔍 Binary Search Result:");
        Product result2 = binarySearch(products, searchId);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

