package technumber;
import java.util.Scanner;
public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int digits=0;
		int firstHalf, secondHalf,squareNum=0;
		int num=n;
		while(num>0) {
			digits++;
			num/=10;
		}
		if(digits%2==0) {
			num=n;
			firstHalf=num%(int)Math.pow(10,digits/2);
			secondHalf=num/(int)Math.pow(10,digits/2);
			squareNum=(firstHalf+secondHalf)*(firstHalf+secondHalf);
			if(squareNum==n) {
				System.out.println("tech number");
			}else {
				System.out.println("It can't be a tech number");
			}
		}
		else {
			System.out.println("It can't be a tech number");
		}
	}

}

