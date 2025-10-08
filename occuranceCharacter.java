package popular;

import java.util.Scanner;

public class occuranceCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		
		String s=sc.next();
		int count=0;
		char Search='A';
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==Search)
				
			{
				System.out.println("found");
				System.out.println("present at index");
				count++;
			}
			
		}
		System.out.println(count);
	}

}
