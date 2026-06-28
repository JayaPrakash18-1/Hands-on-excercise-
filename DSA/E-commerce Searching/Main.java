package EcommercePlatformSearchFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int linearSearch(List<Product> list, Product target) {
        int itert = 0;

        for (int i = 0; i < list.size(); i++) {
            itert++;
            if (list.get(i).compareTo(target) == 0) {
                System.out.println("Linear Search Iterations: " + itert);
                return i;
            }
        }

        System.out.println("Linear Search Iterations: " + itert);
        return -1;
    }

    public static int binarySearch(List<Product> list, Product target) {
        int low = 0;
        int high = list.size() - 1;
        int itert = 0;

        while (low <= high) {
            itert++;

            int mid = low + (high - low) / 2;
            int cmp = list.get(mid).compareTo(target);

            if (cmp == 0) {
                System.out.println("Binary Search Iterations: " + itert);
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Binary Search Iterations: " + itert);
        return -1;
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Product p = new Product.Builder()
                    .setProductId(i + 1)
                    .setProductName((char) (i + 65) + "")
                    .setCategory("A")
                    .build();
            list.add(p);
        }

        for (int i = 0; i < 10; i++) {
            Product p = new Product.Builder()
                    .setProductId(i + 1)
                    .setProductName((char) (i + 75) + "")
                    .setCategory("B")
                    .build();
            list.add(p);
        }

        System.out.println("Before Sorting:");
        for (Product p : list) {
            System.out.println(p);
        }

        Collections.sort(list);

        System.out.println("\nAfter Sorting:");
        for (Product p : list) {
            System.out.println(p);
        }

        Product target = new Product.Builder()
                .setProductId(10)
                .setProductName("K")
                .setCategory("B")
                .build();

        int linearIndex = linearSearch(list, target);
        if (linearIndex != -1) {
            System.out.println("Linear Search Found: " + list.get(linearIndex));
        } else {
            System.out.println("Product not found.");
        }

        int binaryIndex = binarySearch(list, target);
        if (binaryIndex != -1) {
            System.out.println("Binary Search Found: " + list.get(binaryIndex));
        } else {
            System.out.println("Product not found.");
        }
    }
}