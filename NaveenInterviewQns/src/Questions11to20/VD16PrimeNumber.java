package Questions11to20;

public class VD16PrimeNumber {	
	public static boolean isPrime(int num) {
		//<=1 are not Prime 
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}			
		}
		return true;		
	}	
	public static void main(String[] args) {		
		for(int i =0; i<=100; i++) {
			if(isPrime(i)== true) {
				System.out.println(i);
			}
		}

}}
