package countchar;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= new String();
		str=sc.nextLine();
	   //count without sapce
    	int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println(count);
		//count with sapce
		System.out.println(str.length());
		//Count start from 2string
		//int s=str.indexOf(' ');
		//String c=str.substring(s+1, str.length());
		//System.out.println(c.length());
	}

}
