package javaprogram;



public class Stringreverse {
	
 

public static void main(String[]args) {
	 
	 String str = "seema";
	 String reverse = "";
	 
	
	for(int i= str.length()-1; i>=0; i--) {
		
		reverse = reverse+ str.charAt(i);
	}
	if(reverse.equals(str)) {
		System.out.println("The String is Palidrom");
	}else {
		System.out.println("The String is not Palidrom");
		
	}
 }

}
