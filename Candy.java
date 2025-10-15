public class Candy{

  private double price;
  private int amount;

  //non-parameterized contructor
  public Candy(){
    price = 0.50;
    amount = 0;
  }
  
  //parameterized constructors
  public Candy (double price){
    this.price = price;
  }
  public Candy(double price, int amount){
    this.price = price;
    this.amount = amount;
  }

  //gets amount
  public int getAmount(){
    return amount;
  }

  //gets price
  public double getPrice(){
    price *= amount;
    return price;
  }

  //sets amount
  public void setAmount(int amount){
    this.amount = amount;
  }

  //the toString() method. 
  public String toString(){
    return amount + " for $" + getPrice();
  }
}