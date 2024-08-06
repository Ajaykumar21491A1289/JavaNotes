import java.util.*;
class Nut
{
	int nutCost;
	Nut()
	{
		nutCost = 10;
	}
	int nutCost()
	{
		return nutCost;
	}
}
class Bolt
{
	int boltCost;
	Bolt()
	{
		boltCost = 20;
	}
	int boltCost()
	{
		return boltCost;
	}
}
class Screw
{
	int screwCost;
	Screw()
	{
		screwCost = 30;
	}
	int screwCost()
	{
		return screwCost;
	}
}
class Inventory
{
	ArrayList<Nut> nuts = new ArrayList<Nut>();
	ArrayList<Bolt> bolts = new ArrayList<Bolt>();
	ArrayList<Screw> screws = new ArrayList<Screw>();
	void addNut(Nut n)
	{
		nuts.add(n);
	}
	void addBolt(Bolt b)
	{
		bolts.add(b);
	}
	void addScrew(Screw s)
	{
		screws.add(s);
	}
	int totalCost()
	{
		int total = 0;
		for(Nut n : nuts)
			total = total + n.nutCost();
		for(Bolt b : bolts)
			total = total + b.boltCost();
		for(Screw s : screws)
			total = total + s.screwCost();
		return total;
	}
}
public class InventoryDemo1 {
	public static void main(String[] args) {
		Inventory i = new Inventory();
		Nut n1 = new Nut();
		Nut n2 = new Nut();
		Nut n3 = new Nut();
		i.addNut(n1);
		i.addNut(n2);
		i.addNut(n3);
		Bolt b1 = new Bolt();
		Bolt b2 = new Bolt();
		i.addBolt(b1);
		i.addBolt(b2);
		Screw s1 = new Screw();
		i.addScrew(s1);
		System.out.println("Total Cost = "+i.totalCost());
	}
}
