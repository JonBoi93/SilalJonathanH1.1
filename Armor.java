public class Armor extends Item{
 private int defense;

public Armor(String Name, int Weight, int Defense){
  super(Name, Weight);
  this.defense = Defense;
 }
 public int getDefense(){
  return defense;
  }
  public void examine() {
    System.out.println("Item " + super.getName() + " weighs " + super.getWeight() + " defense " + getDefense());
 }
}