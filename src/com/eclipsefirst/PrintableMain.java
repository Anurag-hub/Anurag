interface Printable{
	void print();
	}
class Employee implements Printable{
	public void print(){
		System.out.print("this is Employee \n");
	}
}
class Circle implements Printable{
	public void print(){
		System.out.print("This is inside circle");
	}
}
class PrintableMain{
	public static void printAll(Printable p[]){
		for (int i=0;i<p.length;i++){
			p[i].print();
		}
	}
	public static void main(String[] args){
		Printable p[]=new Printable[2];
		p[0]=new Employee();
		p[1]=new Circle();
		printAll(p);
	}
}
