package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        ProductView pv=new ProductView();
        pv.addProduct("Dal", 10, 500);
        pv.addProduct("Wheat", 10, 100);
        pv.displayAll();
        pv.updateProduct(1, "Rice", 100, 120);
        pv.displayAll();
        pv.deleteProduct(1);
    }
}
