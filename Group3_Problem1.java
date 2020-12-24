
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        public class Group3_Problem1 {

            public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String studentNumber, studentLastName, studentFirstName;
                double midtermGrade, finalGrade, semestralGrade, mg, fg, sg;

                System.out.print("Enter Student Number: ");
                studentNumber= br.readLine();

                System.out.print("Enter Student Last Name: ");
                studentLastName = br.readLine();

                System.out.print("Enter Student First Name: ");
                studentFirstName = br.readLine();

                System.out.print("Enter Midterm Grade: ");
                midtermGrade = Double.parseDouble(br.readLine());
                mg = midtermGrade * .4;

                System.out.print("Enter Final Grade:  ");
                finalGrade = Double.parseDouble(br.readLine());
                fg = finalGrade * .6;

                semestralGrade = mg + fg;

                System.out.print("Semestral Grade: " + semestralGrade);
                sg = Double.parseDouble(br.readLine());

            }

        }