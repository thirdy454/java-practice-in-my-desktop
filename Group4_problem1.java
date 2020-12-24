import java.util.Scanner;

//PROBLEM 1
public class  Group4_problem1{

   public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input your Student Name: ");
	String name = input.nextLine();

	System.out.print("Input your Average: ");
	float average = input.nextFloat();
       
	System.out.print("Input your Tuition Fee: ");
	float tuitionFee = input.nextFloat();

	if(average>=95 && average <=100)
		
	{
	  float discount = tuitionFee*1f; // Int was replaced
	  float totalTuitionFee = tuitionFee - discount;
	  System.out.println("100% Discount " + "Your Total Tuition Fee :" + totalTuitionFee);
	}
	else if(average >= 90 && average <=94)
	{
	  double discountOne = tuitionFee * 0.25;
	  double totalTuitionFee = tuitionFee - discountOne;
	  System.out.println("25% Discount " + "Your Total Tuition Fee: " + totalTuitionFee);
	}
	else if(average >= 89 && average<= 90)
	{
	  double discountTwo = tuitionFee* 0.10;
	  double totalTuitionFee = tuitionFee-discountTwo;
	  System.out.println("10% Discount " + "Your Total Tuition Fee: " + totalTuitionFee);
	}
	else if ( average <= 84)
	{ 
	  System.out.println("No Discount");
	}
	else if ( average > 100){
	  System.out.println("Invalid Average");
	  }
	
   }
   
}  