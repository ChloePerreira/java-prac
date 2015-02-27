//add, subtract, multiply, divide
import java.util.Scanner;

public class Calc {
  public static void main (String[] args){
    Scanner inputGetter = new Scanner(System.in);
    String doThing = "nothing";
    while (!doThing.equals("exit")){
      System.out.println("What do you want to do?");
      doThing = inputGetter.next();
      if (doThing.equals("add")){
        System.out.print(doThing+"\n");
        int[] numChosen = getNumbers(doThing);
        System.out.print(numChosen[0] + " and " + numChosen[1]);
      } else if (doThing.equals("subtract")){
        System.out.print(doThing+"\n");
      } else if (doThing.equals("multiply")){
        System.out.print(doThing+"\n");
      } else if (doThing.equals("divide")){
        System.out.print(doThing+"\n");
      } else if (doThing.equals("exit")){
        break;
      } else {
        System.out.println(
          "Invalid input. Enter exit to quit.");
          System.out.print(doThing+"\n");
        }
      }
  }  
  
  public int[] getNumbers(action){
    System.out.println("Enter the first number to " + action + "\n");
    int[] numArray = new int[2];
    numArray[0] = input.nextInt();
    System.out.println("Enter the second number: ");
    numArray[1] = input.nextInt();
    return numArray;
  }
}
