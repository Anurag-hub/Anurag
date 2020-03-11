class Employee implements Cloneable{
private Date dob;
public Employee(Date dob){
this.dob=dob;
}

public Date getDob(){
return this.dob;
}

public void setDob(Date dob){
this.dob=dob;
}

public Object clone(){
try{
Employee e=(Employee)super.clone();
e.setDob((Date)(this.dob).clone());
return e;

}catch(CloneNotSupportedException e){
e.printStackTrace();
return null;
}
}

public String toString(){
return "Employee dob ="+dob;
}

}

class Date implements Cloneable{
private int day;
private int month;
private int year;

public Date(){
this.day=10;
this.month=3;
this.year=1998;
}

public Date(int day,int month, int year){
this.day=day;
this.month=month;
this.year=year;
}
public Object clone(){
try{
return super.clone();
}catch(CloneNotSupportedException e){
e.printStackTrace();
return null;
}
}
public String toString(){
return "Date ->"+ this.day+"-"+this.month+"-"+this.year;
}
}
class CloneMain{
public static void main(String []args){
Date d=new Date(10,3,1998);
Employee e=new Employee(d);
Employee e1=(Employee)e.clone();
Date d1=(Date)d.clone();
e1.setDob(d1);
System.out.println(e+" "+e1);
System.out.println(e.getDob().hashCode()+" "+e1.getDob().hashCode());
System.out.println("Shalow: "+(e.getDob()==e1.getDob()));
}
}
	
			
	