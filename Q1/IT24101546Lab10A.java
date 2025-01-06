import java.util.Scanner;
public class IT24101546Lab10A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Enter marks (1 to 100): ");
        int num = input.nextInt();

        assert (num>=0 && num<=100):"Invalide Marks";

        System.out.println();
        System.out.println("Mark is validated");
        
    }
}   
