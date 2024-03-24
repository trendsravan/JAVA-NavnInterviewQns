package Questions01to10;

public class VD03RemoveJunkInStr3 {

	public static void main(String[] args) {
		// Remove Junk In A Given String
		
		String s = "Hello World !@#$%^ 009";	
		String JunkRemoved ="";
		String SpecialChar = "";
		
		JunkRemoved = s.replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(JunkRemoved);
		SpecialChar = s.replaceAll("[a-zA-Z0-9\\s]", "");
			System.out.println(SpecialChar);

	}

}
