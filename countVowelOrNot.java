package String;

public class countVowelOrNot {
    public static void main(String[] args) {
        String str="Anish";
        int vowelCount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'
            ||ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U' ) {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
