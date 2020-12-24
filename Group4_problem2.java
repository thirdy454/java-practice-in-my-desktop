import javax.swing.JOptionPane;


public class Group4_problem2 {
//PROBLEM 2
    public static void main(String[] args) {

                JOptionPane jop = new JOptionPane();
                String employeeName = JOptionPane.showInputDialog("Enter your Employee Name: ");
                int ratePerHour = Integer.parseInt(JOptionPane.showInputDialog("Enter your Rate Per Hour: "));
                int numberofHoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter your No. of Hours worked: "));


                if(numberofHoursWorked > 8 )
                {
                    int excedingTime = numberofHoursWorked - 8;
                    float additional = ratePerHour * 0.30f;
                    float otPay = excedingTime * additional;

                    float dailyWage = ratePerHour * numberofHoursWorked + otPay;
                    JOptionPane.showMessageDialog(null,"Your Daily wage: " + dailyWage);
                }
                else
                {
                    int dailyWage = ratePerHour * numberofHoursWorked;
                    JOptionPane.showMessageDialog(null,"Your Daily Wage: "+ dailyWage );
                }


            }


}