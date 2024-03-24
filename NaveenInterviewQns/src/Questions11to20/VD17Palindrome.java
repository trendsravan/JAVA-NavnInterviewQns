package Questions11to20;

public class VD17Palindrome {
	
	public static boolean isPalindrome(int  num) {
		int OG=num;
		int R =0;
		while(num >0) {
			R =R*10 + num%10;
			num /= 10;			
		}
		return OG == R;
}
	public static void main(String[] args) {	
		int count =0;
		for (int i=0; i<=50; i++) {
			if(VD17Palindrome.isPalindrome(i)==true) {
				count++;
				System.out.println(i);
			}
		}
	System.out.println("COUNT =" + count);
		
}}
