package Project;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, res;
		
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter first number");
	    n1 = input.nextInt();

	    System.out.println("Enter second number");
	    n2 = input.nextInt();
	    
	    System.out.println("Enter 1 for : +, Enter 2 for : -, enter 3 for : *, Enter 4 for : /");
	    int choice = input.nextInt();

	    switch (choice) {

	     
	      case 1:
	        res = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + res);
	        break;

	 
	      case 2:
	        res = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + res);
	        break;

	     
	      case 3:
	        res = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + res);
	        break;

	     
	      case 4:
	        res = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + res);
	        break;

	      default:
	        System.out.println("Invalid operator");
	        break;
	    }
	}

}
