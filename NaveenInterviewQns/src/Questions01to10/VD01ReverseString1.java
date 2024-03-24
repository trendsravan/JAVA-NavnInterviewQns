package Questions01to10;

public class VD01ReverseString1 {

	public static void main(String[] args) {

		String s = "Selenium";
		String rev ="";
		
		for (int i =s.length()-1; i>=0;  i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

	}

}
