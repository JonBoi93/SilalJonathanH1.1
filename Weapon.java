public class Weapon extends Item{
 private int damage;

public Weapon(String Name, int Weight, int Damage){
  super(Name, Weight);
  this.damage = Damage;
 }
 public int getDamage(){
  return damage;
  }
  public void examine() {
    System.out.println("Item " + super.getName() + " weighs " + super.getWeight() + " damage " + getDamage());
 }
}