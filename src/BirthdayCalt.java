import java.util.Scanner;

public class BirthdayCalt {

	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter person 1's Birth Year");
		int p1year = Integer.parseInt(input.nextLine());
		System.out.println("Please enter person 1's Birth Month");
		int p1month = Integer.parseInt(input.nextLine());
		System.out.println("Please enter person 1's Birth Day");
		int p1day = Integer.parseInt(input.nextLine());
		
		System.out.println("Please enter person 2's Birth Year");
		int p2year = Integer.parseInt(input.nextLine());
		System.out.println("Please enter person 2's Birth Month");
		int p2month = Integer.parseInt(input.nextLine());
		System.out.println("Please enter person 2's Birth Day");
		int p2day = Integer.parseInt(input.nextLine());
		
		if (p1year < p2year) {
			
			System.out.println("Person 1 is older.");
			
		}
		
		else if (p2year < p1year) {
			
			System.out.println("Person 2 is older");
			
		}
		
		else if (p1year == p2year) {
			
			if (p1month < p2month) {
				
				System.out.println("Person 1 is older");
				
			}
			
			else if (p2month < p1month) {
				
				System.out.println("Person 2 is older");
				
			}
			
			else if (p1year == p2year) {
				
				if (p1day < p2day) {
					
					System.out.println("Person 1 is older");
					
				}
				
				else if (p2day < p1day) {
					
					System.out.println("Person 2 is older");
					
				}
				else if (p1day == p2day) {
					
					System.out.println("Both people are the same age.");
					
				}
				
			}
			
		}
	}
	
}
