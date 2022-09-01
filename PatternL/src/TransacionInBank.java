import java.util.Scanner;
public class TransacionInBank {

	        private int bal=10; 
			private int pwd;
			
			public void deposite(int money) {
				System.out.print("ENTER PASSWORD");
				Scanner sc=new Scanner(System.in);
				pwd =sc.nextInt();
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
				System.out.print("ENTER THE PASSWORD");
				Scanner sc=new Scanner(System.in);
				pwd =sc.nextInt();
				if(pwd==6566) {
				
					System.out.print("total balance: "+bal);
				}
				
				else {
					System.out.print("incorrect pwd");
				}
			}
			
		}

		  public class Bank {
			public static void main(String  []args) {
				
				Bank b=new Bank();
				
				int ch;
				System.out.println("1. Deposite");
				System.out.println("2. Withdraw");
				System.out.println("3.get balance");
				
				System.out.print("\n ENTER your choice");
				Scanner s2=new Scanner(System.in);
				ch=s2.nextInt();
				
				switch(ch) {
				
				case 1: b.deposite(1);
				break;
				case 2: b.withdraw(12);
				break;
				}	
			}
		  }
				
				
				