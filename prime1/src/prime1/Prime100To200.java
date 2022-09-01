package prime1;

public class Prime100To200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=100; n<=200; n++) {
			int temp=0;
			for (int i=2; i<=n-1;i++) {
				if (n%i==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(n);
			}
		}

	}


	}


