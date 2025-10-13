package String;

public class VowelORNot {
    public static void main(String[] args) {
        String s ="Anish";

        boolean containVowel=false;
        for (int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            containVowel=true;
            break;
            }
        }
        if(containVowel){
            System.out.println("Vowel is present");
        }
        else {
            System.out.println("Vowel is not present");
        }
    }
}
