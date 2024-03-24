package Questions01to10;

import java.util.Arrays;

public class VD04FindMissingNumbers4 {
	public static void main(String[] args) {
		
		int[] a = {1,2,4,6,8};
		
		for(int i = a[0]; i<= a[a.length-1]; i++) {
			if(Arrays.binarySearch(a, i) < 0) {
				System.out.print(i);
			}
		}
		System.out.println();
		Arrays.sort(a);
		for(int j = a[0]; j<= a[a.length-1]; j++) {
			System.out.println( Arrays.binarySearch(a, j));			
		}
		
	}
}
		
		

	



