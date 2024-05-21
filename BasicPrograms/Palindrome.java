package palindrome;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int res=0;
		while(n>0) {
			int rem=n%10;
			res=res*10+rem;
			n=n/10;
			
		}
		if(res==m) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
