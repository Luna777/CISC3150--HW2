import java.util.*;

public class HW2Q3{
	
	public static void main(String[] args){
	
		String string1;
		String string2= "";
		int length;
		
		Scanner sc= new Scanner(System.in);
		
		//read a string from user
		System.out.print("enter a string: ");
		string1= sc.nextLine();
		
		length= string1.length();
		
		//read the string1 reversed and store in string2
		for(int i=0; i< length; i++){
			string2= string2+ string1.charAt(length-i-1);
		}
		
		System.out.println();
		
		//compare string1 and string2
		if(string1.compareTo(string2)==0){
			System.out.println("The string is a palindrome.");
		}
		else{
			System.out.println("The string is not a palindrome.");
		}
		
	}//end main
	
}//end class HW2Q3