package vowelsconsonents;
import java.util.Scanner;
public class VowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0;
		int consonents=0;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U') {
				vowels++;
			}
			else {
				consonents++;
				
			}
		}
		System.out.println("Consonents:"+consonents+" vowels:"+vowels);

	}

}
