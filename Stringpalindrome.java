package popular;

import java.util.Scanner;

public class Stringpalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String s=sc.next();
		String rev="";
		for (int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
