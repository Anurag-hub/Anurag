class Car{
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;
	
	public Car(int cylinders,String name){
		this.engine=true;
		this.wheels=4;
		this.name=name;
		this.cylinders=cylinders;
	}
	public int getCylinders(){
		return this.cylinders;
	}
	public String getName(){
		return this.name;
	}
	public String startEngine(){
		return "Car engine started";
	}
	public void accelerate(){
		System.out.println("car speed accelerated to ");
	}
	public String brake(){
		return "car brake applied";
	}
}
class Fortuner extends Car{
	public Fortuner(int cylinders,String name){
	super(4,"fortuner");
	}
	
	
	public String startEngine(){
		return "fortuner engine started";
	}
	
	public void accelerate(){
		System.out.println("fortuner speed accelerated to ");
	}
	
	public String brake(){
		return "fortuner brake applied";
	}
}
public class CarMain{
	public static void main(String[] args){
		
		Car c=new Car(8,"models");
		System.out.println(c.startEngine());
		c.accelerate();
		System.out.println(c.brake());
		Fortuner f=new Fortuner(6,"fortuner f5");
		System.out.println(f.startEngine());
		f.accelerate();
		System.out.println(f.brake());
	}
}
	
	
	

		
		
	