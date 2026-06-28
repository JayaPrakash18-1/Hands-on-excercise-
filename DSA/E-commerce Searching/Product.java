package EcommercePlatformSearchFunction;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private String category;
    private Product(Builder b){
        productId=b.productId;
        productName=b.productName;
        category=b.category;
    }
    public static class Builder{
        private int productId;
        private String productName;
        private String category;
        public Builder setProductId(int id){this.productId=id; return this;}
        public Builder setProductName(String name){this.productName=name; return this;}
        public Builder setCategory(String category){this.category=category; return this;}
        public Product build(){return new Product(this);}
    }
    public int getId(){return this.productId;}
    public String getName(){return this.productName;}
    public String getCategory(){return this.category;}

    public int compareTo(Product obj){
        return this.productName.compareToIgnoreCase(obj.productName);
    }

    public String toString() {
        return "Product-> " +
                "productId=" + productId +
                ", productName=" + productName +
                ", category=" + category;
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
