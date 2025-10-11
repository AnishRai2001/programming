package popular;

public class StringToLowercase {
public static void main(String[] args) {
	String s ="ANIH";
	String lowercase="";
	String lowercase1="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		lowercase=lowercase+Character.toLowerCase(c);
		lowercase1=s.charAt(i)+lowercase1;
	
	}
	System.out.println(lowercase);
	System.out.println(lowercase1);
}
}
