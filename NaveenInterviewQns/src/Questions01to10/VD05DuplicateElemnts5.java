package Questions01to10;
import java.util.Set;
import java.util.HashSet;

public class VD05DuplicateElemnts5 {
	public static void main(String[] args) {
		 String[] name = {"Java", "JavaScript","Ruby","c","c","Java"};
		 
		 
		 	//By Using For Loop[0(n)]
		 for (int i =0; i<=name.length-1; i++) {
			 for(int j=i+1; j<=name.length-1; j++) {
				if( name[i].equals(name[j])) {
					System.out.println(name[i]);}}}
		 
		 	//By Using HashSet
		 Set<String> obj =new HashSet();
		 for(String names:name) {
			 if(obj.add(names)==false) {
				 System.out.println(names);}}
			 
		 
		
		 
		 
}}
