//learned printf:
//http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf

import java.util.*;

public class HW2Q1{
	
	public static void main(String[] args){
		
		int yourHeight;
		
		Scanner sc = new Scanner(System.in);
		
		//get the pyramid's height
		System.out.print("enter the height of your pyramid: ");
		yourHeight=sc.nextInt();
		
		int x = yourHeight;
		
		//print the pyramid
		for(int i=0; i<x; i++){
			
			for(int j=0; j<x-i-1; j++)
				System.out.print("   ");
			
			for(int k=1; k<i+2; k++)
				//System.out.print(" "+ k);
				System.out.printf("% 3d", k);
			
			for(int l=i; l>0; l--)
				//System.out.print(" "+ l);
				System.out.printf("% 3d", l);
			
			System.out.println();
			
		}
		
	}//end main
	
}//end class HW2Q1