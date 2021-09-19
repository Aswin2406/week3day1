package week3day1;

public class Stringreplace {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		
		String characterreplace = sentence.replace("8", "11");
		System.out.println("replaced"+ characterreplace );
		char[] charArray = characterreplace .toCharArray();
          for (int i = 5; i < charArray.length; i++) {
        	  System.out.print(charArray[i]);
          }
			
		}

}
