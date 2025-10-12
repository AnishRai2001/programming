package popular;

public class DeleteAlternateCharacters {
/*	public static void main(String[] args) {
		
			String s ="ANIH";
			String result="";
			for(int i=0;i<s.length();i++) {
				if(i%2==0) {
					result=result+s.charAt(i);
				}
			}
			System.out.println(result);
	}
*/
	  static String delAlternate(String S) {
	        // code here
	        String result="";
	        for(int i=0;i<S.length();i++){
	            if(i%2==0){
	                result=result+S.charAt(i);
	            }
	        }
	        return result;
	        
	    }
	    public static void main(String[] args) {
	        String s="Anish";
	        String result=delAlternate(s);
	        System.out.println(result);
	        
	    }
}
