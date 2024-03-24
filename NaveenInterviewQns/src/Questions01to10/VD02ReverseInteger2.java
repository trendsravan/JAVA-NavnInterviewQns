package Questions01to10;

public class VD02ReverseInteger2 {

	public static void main(String[] args) {
		// Reversing a Given Integer
		int a = 12345;
		int rev = 0;
		
		while(a>0) {
			rev = rev*10 + a%10; //2 // 20 + 1		
			a = a/10;
		}
		System.out.println(rev);

	}

}
