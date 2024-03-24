package Questions11to20;

public class VD12SingleTon {
	public static VD12SingleTon singleton =null;
	String s ="";
	
	public VD12SingleTon() {
		s=" Hey I am In SingleTon Design Pattern";
	}
	public static VD12SingleTon isSingleTon() {
		if(singleton == null) {
			singleton = new VD12SingleTon();
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		
		VD12SingleTon x =VD12SingleTon.isSingleTon();
		VD12SingleTon y =VD12SingleTon.isSingleTon();
		VD12SingleTon z =VD12SingleTon.isSingleTon();
		y.s =(y.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
		
		z.s =(z.s).toLowerCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
				
		
	}
}
