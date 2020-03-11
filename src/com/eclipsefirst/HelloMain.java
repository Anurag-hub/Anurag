import java.lang.annotation.*;

class Hello{
	
	final static int constant =10;
	private int x;
	private int y;
	public Hello(){
	}		
	public Hello(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	@Deprecated
	public  void add(){
		System.out.println("addition is "+(x+y));
	}
	public  void addon(){
		System.out.println("improved is "+(x+y+constant));
	}
	
}
class NoHello extends Hello{
	@Override
	public void add(){
		Hello t=new Hello(30,5);
		System.out.println("real is "+(t.getX()+t.getY()-Hello.constant));
	}
}
	
class HelloMain{
	@SuppressWarnings("deprecation")
    public static void main(String[] args){
		Hello h=new Hello(5,10);
		NoHello h1=new NoHello();
		h1.add();
		h.add();
		h.addon();
	}
}
		
		