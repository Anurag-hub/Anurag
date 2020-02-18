interface Sortable{
	void sort (Sortable s[]);
}
class Employee implements Sortable{
	private String name;
	
	public Employee(String name){
		this.name=name;
	}
	boolean sort(Sortable s){
		if((this.name.compareTo((Employee)s).name)>0){
			return false;
		}
			else {
				return true;
		
	}
	}
}
class Circle implements Sortable{
	private int radius;
	
	private Circle(int radius){
		this.radius=radius;
	}
	public int getRadius(){
		return this.radius;
	}
	public boolean sort(Sortable s){
		if(this.radius<(Circle)s.getRadius())
			return false;
		else 
			return true;
	}
	public string toString(){
		return this.radius+" ";
	}
}
	
class SortableMain{			
	public static void sortAll(Sortable s[]){
		for (int i=0;i<s.length-1;i++){
			for(int j=0;j<s.length-i-1;j++){
			if(s[j].sort(s[j+1])){
					Sortable temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	
	for(int k=0;k<s.length;k++){
		System.out.println(s[k]);
	}
	
	
	public static void main(String[] args){
		Sortable s[]=new Sortable[2];
		Sortable s1[]=new Sortable[2];
		s[0]=new Employee("Anurag");
		s[1]=new Employee("Pandey");
		s1[0]=new Circle(2);
		s1[0]=new Circle(2);
		sortAll(s);
		sortAll(s1);
	}
		
		
}			