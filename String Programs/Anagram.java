package anagram;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str1=new String();
		String str2=new String();
		str1=sc.nextLine();
		str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Not anagram");
		}
		else {
		//converting strings into character arrays
		char[] string1=str1.toCharArray();
		char[] string2=str2.toCharArray();
		//sorting
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if(Arrays.equals(string1, string2)==true) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
     
	}
	}

}
