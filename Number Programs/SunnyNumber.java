//Sunny Number
package sunnynumber;
import java.util.*;
 
public class SunnyNumber {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sunnyNum(num);
	}
    static boolean perfectSquare(double num) {
    	double sqr_num=Math.sqrt(num);
    	return((sqr_num - Math.floor(sqr_num))==0);
    }
    static void sunnyNum(int n) {
    	if(perfectSquare(n+1)) {
    		System.out.println("Sunny Number");
    	}
    	else {
    		System.out.println("Not Sunny Number");
    	}
    }
}
