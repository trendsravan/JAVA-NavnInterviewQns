package Questions01to10;

public class VD10Final_Finally_Finialize {
	public static void main(String[] args) {
		
		int i =0;		
		try {
			int x =10/i;
		}catch(Exception e) {
			System.out.println("You got Infinite Exception");
		}finally {
			System.out.println("Finally block Executed");
		}
		
		
	

}}
