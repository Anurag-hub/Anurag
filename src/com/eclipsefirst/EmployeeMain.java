class Employee{
	private int id;
	private int salary;
	private String name;
	
	public Employee(int id,int salary,String name){
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public int getSalary(){
		return this.salary;
	}
	public String toString(){
		return this.id+"/t"+this.name+"/t"+this.salary;
	}
}
	class Manager extends Employee{
		private int incentive;
		public Manager(int id,int salary,String name,int incentive){
			super(id,salary,name);
			this.incentive=incentive;
		}
		public int getSalary(){
			return super.getSalary()+this.incentive;
		}
		public String toString(){
			return super.toString()+this.incentive;
	}
	}
	class Labour extends Employee{
		private int overtime;
		public Labour(int id,int salary,String name,int overtime){
			super(id,salary,name);
			this.overtime=overtime;
		}
		public int getSalary(){
			return super.getSalary()+this.overtime;
		}
		public String toString(){
			return super.toString()+this.overtime;
		}
	}

	public class EmployeeMain{
		public int calculateSalary(Employee emp[]){
			int totalSalary=0;
			
			for (int i=0;i<emp.length;i++){
				totalSalary+=emp[i].getSalary();
			}
			return totalSalary;
		}
		public static void main(String[] args){
			Employee e[]=new Employee[4];
			e[0]=new Manager(1234,10000,"Anurag",2000);
			e[1]=new Manager(1235,12000,"Anurag",2000);
			e[2]=new Labour(1236,8000,"Anurag",1000);
			e[3]=new Labour(1237,8000,"Anurag",1000);
			EmployeeMain em=new EmployeeMain();
			int result=em.calculateSalary(e);
			System.out.println(result);
		}
	}
	
			
		
			
	
	
			
		
	