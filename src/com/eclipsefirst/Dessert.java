abstract class DessertItem{
	abstract double getCost();
}
class Candy extends DessertItem{
	private string name;
	private int priceWithoutTax;
	private int priceWithTax;
	
	public Candy (String name,int priceWithoutTax,int priceWithTax){
		this.name=name;
		this.priceWithoutTax=priceWithoutTax;
		this.priceWithTax=priceWithTax;
	}
	
	