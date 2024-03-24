package Questions01to10;

public class VD06HighestLowestInArray6 {
	public static void main(String[]args) {
		
		int[] a = {-1, 50, -1, -88, -8899};
		
			int largest = a[0];
			int smallest = a[0];
		
		for(int i=0; i<=a.length-1; i++){
			if(a[i]> largest) {
				largest = a[i];
			}
			else if(a[i]<smallest){
				smallest =a[i];
			}
		}
			System.out.println("Smallest =" + smallest);
			System.out.println("Largest =" + largest);
		
		
		
	

}}
