package largenum;
import java.util.Scanner;
public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
	}

}
