package Questions01to10;
import java.util.Set;
import java.util.HashSet;

public class VD05DuplicateElemnts5 {
	public static void main(String[] args) {
		 String[] name = {"Java", "JavaScript","Ruby","c","C","JaVa"};
		 
		 
		 	//By Using For Loop[0(n)]
		 for (int i =0; i<=name.length-1; i++) {
			 for(int j=i+1; j<=name.length-1; j++) {
				if( name[i].equalsIgnoreCase(name[j])) {
					System.out.println("Logic By For Loop =" + name[i]);}}}
		 
		 	//By Using HashSet
		 Set<String> obj =new HashSet<String>();
		 for(String names:name) {
			String LC = names.toLowerCase();
			 if(obj.add(LC)==false) {
				 System.out.println("Logic By HashSet =" +names);}}
			 
		 //By Using HashSET & ignoreCase
		 Set<String> uniqueElements = new HashSet<>();
	        Set<String> duplicates = new HashSet<>();
	        for (String element : name) {
	            String lowercaseElement = element.toLowerCase(); // Convert to lowercase
	            if (!uniqueElements.add(lowercaseElement)) {
	                duplicates.add(element);
	            }
	        }
	        System.out.println("Duplicates in the array: " + duplicates);
		
		 
		 
}}
