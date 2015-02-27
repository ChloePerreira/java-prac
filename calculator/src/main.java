/**
 * Created by crystal on 2/24/15.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = reader.nextInt();
        System.out.println("Enter the second number: ");
        int y = reader.nextInt();
        Calculator calc = new Calculator(x, y);

        System.out.println("Enter the action: ");
        String action = reader.next();
        if (action.equals("add")){
            System.out.print(calc.add());
        }
    }
}
