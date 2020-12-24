import javax.swing.JOptionPane;

public class jose{

	public static void main(String[] args) {
		String studname;
		double ave,tf,ttf;
		JOptionPane j = new JOptionPane();
		
		
		studname = j.showInputDialog(null, "Enter student name: ");
		ave = Double.parseDouble(j.showInputDialog(null, "Enter Average:"));
		tf = Double.parseDouble(j.showInputDialog(null, "Enter Tuition Fee: "));
		
		if (ave <= 100 && ave >= 95) 
			{
				j.showMessageDialog(null,"Total Tuition Fee: Php 0");
			}
		else if (ave >= 90) 
			{
				ttf = tf - (tf * .25);
				j.showMessageDialog(null,"Total Tuition Fee: Php" + ttf);
			}
		else if (ave >= 85) 
			{
				ttf = tf - (tf * .1);
				j.showMessageDialog(null,"Total Tuition Fee: Php" + ttf);
			}
		else if (ave <= 84) 
			{
		 		ttf = tf;
		 		j.showMessageDialog(null,"Total Tuition Fee: Php" + ttf);
			}

		
		/*String studentName;
		 * 	if (ave >= 95 && ave <= 100) 
			{
			j.showMessageDialog(null,"Total Tuition Fee: Php 0");
			}
		else if (ave <= 94 && ave >= 90) 
			{
			 double ttf = tf * .25;
			 
			}
	
		else
		{
			j.showMessageDialog(null,"Invalid Average");
		}
		
		 * 	else if (ave <= 94 && ave >= 90) 
			{
			 ttf = tf * .25;
			}
		else if (ave <= 89 && ave >= 85) 
			{
			 ttf = tf * .1;
			}
		else if (ave <= 84) 
			{
			 ttf = tf;
			}
		 * JOptionPane jop = new JOptionPane();
		int n1,n2, sum;
		
		n1= Integer.parseInt(jop.showInputDialog("!st number"));
		
		JOptionPane.showInputDialog(null,"Ernter Student name:");
		JOptionPane.showInputDialog(null,"Ernter Student name:");
		JOptionPane.showInputDialog(null,"Ernter Student name:");
		*/
		System.exit(0);
	}

}