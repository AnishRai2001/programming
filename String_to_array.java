package popular;

public class String_to_array {
	public static void main(String[] args) {
		String s ="hello";
		char []arr=new char[s.length()];
		for (int i=0;i<arr.length;i++) {
			arr[i]=s.charAt(i);
		}
		System.out.println(arr);
		
	}

}
