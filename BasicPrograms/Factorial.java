package factorial;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mul=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			mul=mul*i;
			
		}
		System.out.println(mul);

	}

}
