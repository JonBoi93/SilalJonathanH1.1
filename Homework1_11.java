public class Homework1_11{
public static void main(String args[]) {
 Item I = new Item("fighter", 100);
 I.examine();
 System.out.println("Test getName " + I.getName());
 System.out.println("Test getWeight " + I.getWeight());
 System.out.println("Test examine");
 I.examine();
 
    Food F = new Food("Energy", 10,50,10);
     System.out.println("Test getName " +F.getName());
 System.out.println("Test getWeight " + F.getWeight());
 System.out.println("Test getNutrition " + F.getNutrition());
 System.out.println("Test getQuantity " + F.getQuantity());
 System.out.println("Test examine");
  F.examine();
 
    Weapon W = new Weapon("Attack", 100,50);
     System.out.println("Test getName " + W.getName());
 System.out.println("Test getWeight " + W.getWeight());
 System.out.println("Test getDamage " + W.getDamage());
 System.out.println("Test examine");
  W.examine();
  
    Armor A = new Armor("Defend", 100,50);
     System.out.println("Test getName " + A.getName());
 System.out.println("Test getWeight " + A.getWeight());
 System.out.println("Test getDefense " + A.getDefense());
 System.out.println("Test examine");
  A.examine();
}
}