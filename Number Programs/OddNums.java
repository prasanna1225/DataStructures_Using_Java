package oddnums;
import java.util.Scanner;

public class OddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");

			}
		}
		
	}

}
