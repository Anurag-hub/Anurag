enum Status{
	NEW(1),REJECTED(2),ACCEPTED(3),COMPLETED(4);
	int val;
	Status(int val)
	{
		this.val=val;
	}
	public int getValue(){
		return this.val;
	}
	public void setValue(){
		this.val=val;
	}
}
class Order{
	private int id,quantity;
	private Status status;
	private String name;
	public Order(String name,int id,int quantity,Status status){
		this.name=name;
		this.id-=id;
		this.quantity=quantity;
		this.status=status;
	}
	public int getOrderStatus(){
		return status.getValue();
	}
}
class StatusMain{
	public static void main(String[] args){
		Order o=new Order("Players unknown battlegrounds",123,1,Status.ACCEPTED);
		System.out.println(o.getOrderStatus());
	}
}
	
	
	
		
	
	
