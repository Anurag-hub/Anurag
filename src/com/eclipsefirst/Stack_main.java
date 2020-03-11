class StackArray{
	private int arr[];
	
	public StackArray(int arr[]){
		this.arr=arr;
	}
	private int getTop(){
		int i;
		for(i=0;i<arr.length;i++){
			if(arr[i]==0){
			break;
			}
		}
		return i;
	}
	public void push(int x){
		arr[getTop()]=x;
	}
	public int pop(){
		return arr[getTop()];
	}
	public String toString(){
		return " "+this.arr[getTop()-1];
	}
}
class Stack_main{
	public static void main(String [] args){
		StackArray s=new StackArray(new int[10]);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();	
		System.out.println(s);
	}
}
		
		