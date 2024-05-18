package punctuationcount;
import java.util.Scanner;

public class PunctuationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int count=0;
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++) {
    	if(str.charAt(i)==';' || str.charAt(i)=='.' || str.charAt(i)=='/'|| str.charAt(i)==',' || str.charAt(i)=='?' || str.charAt(i)=='*') {
    		count++;
    	}
    }
    System.out.println(count);
    
	}

}
