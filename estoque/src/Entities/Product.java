package Entities;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }
    public void Addproduct(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                 +", $ " + String.format("%2f",price)
                + ", " + quantity
                + " Units, total: $ "
                + String.format("%2f",TotalValueInStock());
    }
}
