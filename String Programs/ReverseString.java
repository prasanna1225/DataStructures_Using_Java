package reversestring;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		String s;  
		Scanner sc=new Scanner(System.in);  
		
		s=sc.nextLine();                    
		
		for(int i=s.length();i>0;--i)               
		{  
		System.out.print(s.charAt(i-1));            
		}  
	}
}
		

	



