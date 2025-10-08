package popular;

import java.util.Scanner;

public class ReverseString {
	/*public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in)	;
	System.out.println("Enter your name here");
		String s=sc.next();
				
		String rev = "";
		for (int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println("Name after reverse");
		System.out.println(rev);
	}*/
	 public static void main(String[] args) {
	        String s="ANish";
	        String rev="";
	       for(int i=0;i<s.length();i++) {
	    	   rev=s.charAt(i)+rev;
	    	   
	    	   
	       }
	       System.out.println(rev);
	    }
	

}
