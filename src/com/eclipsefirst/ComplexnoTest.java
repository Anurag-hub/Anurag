class Complexno{
	private int real;
	private int imaginary;

	public Complexno(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public int getReal(){
		return this.real;
	}
	public int getImaginary(){
		return this.imaginary;
	}

	public Complexno add(Complexno n){
		int real=this.real+n.getReal();
		int imaginary=this.imaginary+n.getImaginary();
		return new Complexno(real,imaginary);
		}
	public Complexno subtract(Complexno n){
		int real=this.real-n.getReal();
		int imaginary=this.imaginary-n.getImaginary();
		return new Complexno(real,imaginary);
		}

	public Complexno multiply(Complexno n){
		int real=this.real*n.getReal();
		int imaginary=this.imaginary*n.getImaginary();
		return new Complexno(real,imaginary);
		}
	public String toString(){
		return "Result="+this.getReal()+"+"+this.getImaginary()+"i";
	}
}
public class ComplexnoTest{
	public static void main(String [] args){
		Complexno n1=new Complexno(2,3);
		Complexno n=new Complexno(4,5);
		Complexno d=n1.add(n);
		Complexno d1=n1.subtract(n);
		Complexno d2=n1.multiply(n);
		System.out.println("Addition "+d);
		System.out.println("Substraction "+d1);
		System.out.println("Multiplication"+d2);
		
	}
}	