package Questions01to10;

public class VD09SwapString {
	public static void main(String[] args) {
			
	String x ="HELLOO";
	String y ="EARTH";
	
	x = x+y;	//x =HELLOWEARTH = 5+5=10	
	y = x.substring(0, x.length()-y.length() ); //y=HELLO
	x = x.substring(y.length());
	
	System.out.println("x =" + x);
	System.out.println("y =" + y);


}}
