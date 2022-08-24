package Project1;
import java.util.Scanner;
public class Classgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        Scanner scan = new Scanner(System.in);
				System.out.println("Enter your Roll no.");
				int rollno=scan.nextInt();
				
				if(rollno==1||
						(rollno-1)%4==0) {
					System.out.println("Sapphire group");
				}
				else if(rollno==2||
						(rollno-2)%4==0) {
					System.out.println("Perl1 group");
				}
				
				else if(rollno==3||
						(rollno-3)%4==0) {
					System.out.println("Ruby group");
				}
				
				else if(rollno==4||
						(rollno-4)%4==0) {
					System.out.println("Emerald group");
				}
				scan.close();
			
		 
			}
	}


