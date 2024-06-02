package perfectsquare;
import java.util.Scanner;
import java.util.*;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double num=sc.nextDouble();
		double sqr=Math.sqrt(num);
		if(sqr-Math.floor(sqr)==0) {
			System.out.println("perfect Square");
		}
		else {
			System.out.println("Not perfect Square");
		}
		
	}

}
