class Stack{
	static final int max=10;
	private int top;
	
	int arr[]=new int[max];
	
	public Stack(){
		top=-1;
	}
	public int getTop(){
		return this.top;
	}
	public void push(int n){
		if(top>=max)
			System.out.println("overflow");
		
		arr[++top]=n;
	}
	public int pop(){
		if(top<=0)
			System.out.println("empty");
		
		return arr[top--];
	}
	public int peek(){
		return arr[top];
	}
}
class Stackmain{
	public static void main(String []args){
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		System.out.println(s.peek());
	}
}
	