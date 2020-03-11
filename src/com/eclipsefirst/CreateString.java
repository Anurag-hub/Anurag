public class CreateString{
		static String s1=new String("ABC");
		static String s2="ABC";
	public static void main(String[] args){
		
		System.out.println(equals_to());
		System.out.println(barabar());
	}
		public static boolean equals_to(){
			return s1.equals(s2);
		}
		public static boolean barabar(){
			return s1==s2;
		}
	}
			