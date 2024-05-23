//divide string
package dividestring;
import java.util.Scanner;
public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.nextLine();
		int len=str.length();
		int n=sc.nextInt();
		String[] eqlParts=new String[n];
		int temp=0;
		int lenchar=len/n;
		if(len%n!=0) {
			System.out.println("String Cannot be equalparts");
		}
		else {
			for(int i=0;i<len;i=i+lenchar) {
				String part=str.substring(i,i+lenchar);
				eqlParts[temp]=part;
				temp++;
		}
			for(int j=0;j<eqlParts.length;j++) {
				System.out.println(eqlParts[j]);
			}
		
		}

	}

}
