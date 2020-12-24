import java.util.Scanner;
public class gradesPractice {

	public static void main(String[] args) {
	
		        System.out.println("I-Acds Grades Computation");
		        Scanner sc= new Scanner(System.in);
		        System.out.print("\nYour Name: ");
		        String yourName = sc.next();
		        System.out.println("\n\n==List of subject==\n");
		        System.out.print("Intcomp: ");
		        int intComp = sc.nextInt();
		        System.out.print("Comprog: ");
		        int comprog = sc.nextInt();
		        System.out.print("Datana: ");
		        int datana = sc.nextInt();
		        System.out.print("Gemst: ");
		        int gemst = sc.nextInt();
		        System.out.print("Gemmw: ");
		        int gemmw = sc.nextInt();
		        System.out.print("Arap: ");
		        int arap = sc.nextInt();
		        System.out.print("PE: ");
		        int pe = sc.nextInt();
		        System.out.print("Fildis: ");
		        int fildis = sc.nextInt();
		        System.out.print("Nstp: ");
		        int nstp = sc.nextInt();

		        double average = (intComp + comprog + datana + gemst + gemmw + arap + pe + fildis + nstp)/9.0;
		        System.out.println("\nAverage:" + average);
				
		
	}	
}
