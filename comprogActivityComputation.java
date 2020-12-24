package gayares;

public class comprogActivityComputation {

	public static void main(String[] args) {
		double grossPay,deduction,netPay;
		grossPay = 25_000.00;
		deduction = grossPay * .1;		
		netPay = grossPay - deduction;
		
		System.out.println("==Deduction & Netpay==\n");
		System.out.println("Grosspay: " + grossPay); 
		System.out.println("Deduction: " + deduction);
		System.out.println("Net Pay: " + netPay);
		
		
	}

}
