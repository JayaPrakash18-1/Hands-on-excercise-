package InventoryManagementSystem;
import java.util.HashMap;
public class ProductController {
    private static HashMap<Integer,Product> list=new HashMap<>();

    public void add(String name,int quantity,double price){
        Product p=new Product()
                    .setPrice(price)
                    .setProductName(name)
                    .setQuantity(quantity);
        list.put(p.getProductId(),p);
    }
    public void update(int id,String name,int quantity,double price){
        Product p=list.get(id);
        if(p==null){
            System.out.println("no item found");
            return;
        }
        p.setPrice(price);
        p.setProductName(name);
        p.setQuantity(quantity);
    }
    public void delete(int id){
        list.remove(id);
    }
    public Product getProduct(int id){
        return list.get(id);
    }
    public void displayAll(){
        for(Product i:list.values()){
            System.out.println(i);
        }
    }
}
