public class Food extends Item{
	private int nutrition;
	private int quantity;

public Food (String Name, int Weight, int Nutrition, int Quantity){
		super(Name, Weight);
		this.nutrition = Nutrition;
		this.quantity = Quantity;
	}
	public int getNutrition(){
		return nutrition * quantity;
	}
	public int getQuantity(){
			return quantity;
		}
		public int getWeight(){
			return super.getWeight() * quantity;
		}
	public void setQuantity(int Quantity){
		quantity = Quantity;
	}
	public void examine() {
		System.out.println("Item " + super.getName() + " weighs " + getWeight() + " nutrition " + getNutrition() + " quantity " + getQuantity());
	}
}