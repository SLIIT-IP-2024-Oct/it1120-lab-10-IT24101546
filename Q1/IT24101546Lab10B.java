import java.util.Scanner;
public class IT24101546Lab10B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;
        
        System.out.println();
        System.out.print("Enter marks (1 to 100): ");
        int num = input.nextInt();

        if (num>75){
            grade = 'A';
        }else if(num>60){
            grade = 'B';
        }else if(num>50){
            grade = 'C';
        }else if(num>40){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println();
        assert (num>75 && grade =='A')||
            (num>60 && grade == 'B')||
            (num>50 && grade == 'C')||
            (num>50 && grade == 'D')||
            (num>50 && grade == 'F'):"Incorrect Grade Assigned";

        System.out.println();
        System.out.println("Mark is validated");
        System.out.println("The Grade for the Entered Marks is : "+ grade);
        
    }
}   
