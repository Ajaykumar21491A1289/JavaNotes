package mypack1;
import java.util.ArrayList;
abstract class Item
{
	abstract int cost();
}
class Nut extends Item
{
	int nutCost;
	Nut()
	{
		nutCost = 10;
	}
	int cost()
	{
		return nutCost;
	}
}
class Bolt extends Item
{
	int boltCost;
	Bolt()
	{
		boltCost = 20;
	}
	int cost()
	{
		return boltCost;
	}
}
class Screw extends Item
{
	int screwCost;
	Screw()
	{
		screwCost = 30;
	}
	int cost()
	{
		return screwCost;
	}
}
class Inventory
{
	ArrayList<Item> items = new ArrayList<Item>();
	void addItem(Item i)
	{
		items.add(i);
	}
	int totalCost()
	{
		int total = 0;
		for(Item i : items)
			total = total + i.cost();
		return total;
	}
}
public class InventoryDemo2 {
	public static void main(String[] args) {
		Inventory i = new Inventory();
		Item n1 = new Nut();
		Item n2 = new Nut();
		
		Item n3 = new Nut();
		i.addItem(n1);
		i.addItem(n2);
		System.out.println(i.items);
		i.addItem(n3);
		Item b1 = new Bolt();
		Item b2 = new Bolt();
		i.addItem(b1);
		i.addItem(b2);
		Item s1 = new Screw();
		i.addItem(s1);
		System.out.println("Total Cost = "+i.totalCost());
	}
}
