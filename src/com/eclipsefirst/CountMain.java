import java.util.*;
class CountMain{
	public static void main(String[] args){
		
		int i;
		int p=0;
		int j=0;
		int k=1;
		int count=0;
		char arr[]=new char[100];
		int arr2[]=new int[100];
		for(i=0;i<100;i++){
			arr2[i]=0;
		}
		System.out.println("enter a line");
		Scanner sc=new Scanner(System.in);
		String s2=sc.nextLine();
		int n=s2.length();
		String s3=s2.trim();
		for (i=0;i<n;i++){
			
			arr[i]=s3.charAt(i);
			p++;
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					arr2[count]=++k;
				}
			}
			k=0;count++;
		}
		for(i=0;i<n;i++){
			for
		
		for(i=0;i<n;i++){
			System.out.println(arr[i]+" has occured "+arr2[i]+"times");
		}
	}
}
		