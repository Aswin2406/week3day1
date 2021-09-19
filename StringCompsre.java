package week3day1;

public class StringCompsre {
	public static void main(String[] args) {
		String  str1="I am Learning Java" ;
	    String  str2="I am learning java?"  ;
	     if(str1==str2) {
	    	 System.out.println("string are equal using ==");
	     }
	     else {
	    	 System.out.println("not equal using ==");
	     }
	     if (str1.equals(str2)) {
	    	 System.out.println("string is equal using .equal");
	     }
	     else {
	    	 System.out.println("not equal useing .equal");
	}
      if (str1.equalsIgnoreCase(str2)) {
    	  System.out.println("string equals using .equalsignorecase");
    	  
      }
      else 
    	  System.out.println("not equal using .equalignorecase");
    	  
}}
