public class RockCandy extends Candy{

  private String color;

  //non-parameterized constructor
  public RockCandy(){
    color = "new color";
  }
  
  //parameterized constructors
  public  RockCandy(double price, int amount, String color){
    super(price, amount);
    this.color = color;
  }
  public RockCandy(int amount, String color){
    super(amount);
    this.color = color;
  }

  //gets color
  public String getColor(){
    return color;
  }

  //sets color
  public void setColor(String newColor){
    color = newColor;
  }

  //the toString() method.
  public String toString(){
    return color + " Sticks. " + super.toString();
  }
}