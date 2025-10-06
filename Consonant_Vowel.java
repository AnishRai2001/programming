package popular;

public class Consonant_Vowel {
	public static void main(String[] args) {
		int conconant=0;
		int vowel=0;	
		String s="Anish";
		for (int i =0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}
			else {
				conconant++;
			}
		}
		System.out.println(conconant+"conconant");
		System.out.println(vowel+"vowel");
	}
	

}
