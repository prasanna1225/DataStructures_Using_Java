package automorphicnumber;
import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int square=num*num;
		while(num>0) {
			int numrem=num%10;
			int sqrem=square%10;
			if(numrem!=sqrem) {
				System.out.println("It's not a automorphic number");
				break;
			}
			else {
			  num=num/10;
			  square=square/10;
			}
			System.out.println("It's a automorphic number");
			break;
		}
		
		
	}

}
