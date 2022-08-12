package cap8.ex2;

public class product {
    private String name; 
    private double Price;
    private int Quantity;

    product(){ }

    product(String name, double Price, int Quantity){
        this.name = name;
        this.Price = Price;
        this.Quantity = Quantity; 
    }

    public double TotalValueInStock(){
        return (float) Price*Quantity;
    }

    public void AddProducts (int quantity){
        this.Quantity = Quantity + quantity;
    }
    public void RemoveProducts(int quantity){
        this.Quantity = Quantity - quantity;
    }

    public String toString(){

        return "Name = "+ this.name  + 
                ", Value = " + this.Price + 
                ", Quantity = " + this.Quantity ; 

    }

}
