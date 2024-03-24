package Questions11to20;

public class VD18Armstrong {
	
	public static boolean isAmstrong(int num) {
		int OGN =num;
		int NumberDigits = String.valueOf(num).length();
		int sum = 0;
		while(num>0) {
			int digit =num % 10;
			sum +=  Math.pow(digit, NumberDigits);
			num /= 10;
		}
		return OGN == sum;		
	}
	public static void main(String[] args) {
		for (int i=0; i<=10000; i++) {
			if(isAmstrong(i) == true) {
				System.out.println(i);
			}
		}
		
	}

}
