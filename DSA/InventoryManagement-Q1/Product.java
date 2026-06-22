package InventoryManagementSystem;

import java.util.Objects;

public class Product {

    private int productId;
    private String productName;
    private int quantity;
    private double price;
    private static int id=1;
    public Product(){
        productId=id;
        id++;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public Product setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    

    public String toString() {
        return "Product-> " +
                "productId=" + productId +
                ", productName=" + productName +
                ", quantity=" + quantity +
                ", price=" + price;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;

        Product product = (Product) obj;
        return productId == product.productId;
    }

    public int hashCode() {
        return Objects.hash(productId);
    }
}