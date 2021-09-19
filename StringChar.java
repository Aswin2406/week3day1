package week3day1;

public class StringChar {
	public static void main(String[] args) {
		String text= "java Exercises";
				char[] str1 = text.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i]=='E'||str1[i]=='s') {
				System.out.println("character are avaiable:"+ str1[i]);
			}
			
		}
	}
	

}
