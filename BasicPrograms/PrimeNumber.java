package primenumber;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		int m=n/2;
		if(n==0 || n==1) {
			System.out.println("Not a Prime Number");
		}
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println("Not a Prime Number");
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Prime Number");
		}

	}

}

