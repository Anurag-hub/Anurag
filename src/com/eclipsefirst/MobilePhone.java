import java.util.*;
class MobilePhone{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		ArrayList<String> grocery =new ArrayList<String>();
		System.out.println("Add items to your cart");
		grocery.add(sc.next());
		System.out.println("Add  more items to your cart");
		grocery.add(sc.next());
		System.out.println("Add  more items to your cart");
		grocery.add(sc.next());
		System.out.println(grocery.size());
		System.out.println(grocery.get(1));
		System.out.println(grocery.indexOf("chocolate"));
		grocery.set(2,"cum");
		System.out.println(grocery.get(2));
	}
}
