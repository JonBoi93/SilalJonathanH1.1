public class Item{
protected int weight;
protected String name;

public Item (String Name, int Weight) {
		this.weight = Weight;
		this.name = Name;
	}

public String getName() {
	return name;
}
public int getWeight() {
	return weight;
}
public void examine() {
	System.out.println("Item " + name + " weighs " + weight);
}
}
