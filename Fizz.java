import java.util.Scanner;

public class Fizz{
	public static void main(String[] args){
		int userNum;
		Scanner input = new Scanner(System.in);
	
		//loop to number
		//print numbers
		//if number is divisible by 3 then print fizz
		//if number is divisible by 5 then print buzz
		//if number is divisible by both then print fizz and buzz
		System.out.println("Enter a number");
		userNum = input.nextInt();
		
		for(int i = 0; i<=userNum;i++){
			boolean printNum = true;
			if((i % 3) == 0){
				System.out.print("Fizz");
				printNum = false;
			}
			if((i % 5) == 0){
				System.out.print("Buzz");
				printNum = false;
			}
			if(printNum){
				System.out.print(i);
			}			
			System.out.println();
	}
	}
	
	
	
	
}