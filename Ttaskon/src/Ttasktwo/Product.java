package Ttasktwo;

public class Product {
    public Integer pid;
    public Integer price;
    public Integer quantity;

    public Product(Object o) {
    }


    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Product(Integer pid, Integer price, Integer quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;

    }

    public Integer getPid() {
        return pid;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }






}
