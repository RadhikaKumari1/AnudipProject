package prime1;
import java.util.Scanner;
class Bank{

	    private int bal=10; 
		private int pwd; 
		
		public void deposite(int money) {
			System.out.print("ENTER PASSWORD");
			Scanner s=new Scanner(System.in);
			pwd =s.nextInt();
			if(pwd==6566) {
				bal=bal+money;
				System.out.print("deposite money:"+money);
				System.out.print("total balance:" +bal);
			}
			
			else {
				System.out.print("incorrect password......try again");
			}
			
		}
		public void withdraw(int money) {
			System.out.print("ENTER PASSWORD");
			Scanner s=new Scanner(System.in);
			pwd =s.nextInt();
			if(pwd==6566) {
				bal=bal-money;
				System.out.print("withdra money: "+money);
				System.out.print("total balance: "+bal);
			}
			
			else {
				System.out.print("incorrect pwd");
			}
		}
		public void checkBalance( int money) {
			System.out.print("ENTER PASSWORD");
			Scanner s=new Scanner(System.in);
			pwd =s.nextInt();
			if(pwd==6566) {
			
				System.out.print("total balance: "+bal);
			}
			
			else {
				System.out.print("incorrect pwd");
			}
		}
		
	}

	   class TransactionInBank {
		public static void main(String []args) {
			
			Bank b=new Bank();
			
			int ch;
			System.out.println("1. Deposite");
			System.out.println("2. Widraw");
			System.out.println("3. CheckBalance");
			
			System.out.print("\n ENTER YOUR CHOICES");
			Scanner s2=new Scanner(System.in);
			ch=s2.nextInt();
			
			switch(ch) {
			
			case 1: b.deposite(1);
			break;
			case 2: b.withdraw(12);
			break;
			case 3: b.checkBalance( 9);
			break;
			default:
				System.out.print("Invalid choice");
			}
		}
	

	}


