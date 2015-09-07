//learned some example of breaking loops by labels from:
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html

public class HW2Q4{
	
	public static void main(String[] args){
		
		int i=5;
		int j=5;
		
		outer:
		while(i>0){//outer loop
			
			i--;
			System.out.println("outside"+i);
			
			while(j>0){//inner loop
				j--;
				System.out.println("inside"+j);
				
				if(j<3)
					break outer;//break outer loop
			}
			
		}
		
	}//end main
	
}//end class HW2Q4