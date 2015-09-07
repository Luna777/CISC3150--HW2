//learned how to use printf from;
//http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf

import java.util.Scanner;

public class HW2Q2{
	
	public static void main(String[] args){
		
		int startpoint=1;
		String emptyday= " ";
		int year;
		String week= "Su Mo Tu We Th Fr Sa";
		
		String[] month= new String[12];
		
		month[0]="January";
		month[1]="February";
		month[2]="March";
		month[3]="April";
		month[4]="May";
		month[5]="June";
		month[6]="July";
		month[7]="August";
		month[8]="September";
		month[9]="October";
		month[10]="November";
		month[11]="December";	
		
		Scanner sc= new Scanner(System.in);
		
		//ask for the year
		System.out.print("enter the year(ex: 2015): ");
		year= sc.nextInt();
		
		//ask for the first day's position in January
		System.out.println("what day the first of January fell on?");
		System.out.print("enter an integer from 1 to 7 represents Monday to Sunday: ");
		startpoint=sc.nextInt();
		System.out.println();
		
		//print calendar.
		for(int i=0; i<12; i++){
			int nextpoint=startpoint;
			//System.out.println("   "+month[i]+" "+year);
			System.out.printf("\n%11s", month[i]);
			System.out.println(" "+year);
			System.out.println(week);
			
			//get how many days in the month
			int daysofthemonth=0;
			if(i==0||i==2||i==4||i==6||i==7||i==9||i==11)
				daysofthemonth=31;
			else if(i==3||i==5||i==8||i==10)
				daysofthemonth=30;
			else if(i==1){
				if(year%4==0||year%400==0)
					daysofthemonth=29;
				else
					daysofthemonth=28;
			}
				
			//print out the empty spaces before the 1st day
			if(startpoint<7&&startpoint>0){
				System.out.printf("%2s", emptyday);
				for(int j=0; j<startpoint-1; j++){
					//System.out.print(emptyday+" ");
					System.out.printf("%3s", emptyday);
				}	
			}
		
			//get the start point for next month
			startpoint= (startpoint+ daysofthemonth )%7;
			
			
			//print all the days of a month
			for(int day=1; day<=daysofthemonth; day++){
				if(nextpoint==0){
					System.out.printf("%2d", day);
					nextpoint=1;
				}
				else if(nextpoint==7){
					//System.out.println(day+" ");
					System.out.printf("\n%2d", day);
					nextpoint=1;
				}
				else{
					//System.out.print(day+" ");
					System.out.printf("% 3d", day);
					nextpoint++;
				}
			}
			
			System.out.println();
			System.out.println();
		}
		
	}//end main
	
}//end class HW2Q2