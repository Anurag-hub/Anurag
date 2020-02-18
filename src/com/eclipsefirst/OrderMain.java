import java.util.*;


public class OrderMain{
	public static void main(String[] args){
		int arr[]=new int[args.length];
		int k;
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
			
		
	}
	
		sort(arr);

	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	}
	public static void sort(int arr[]){
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++){
				
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
	}
}

	