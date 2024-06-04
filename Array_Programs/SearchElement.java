package searchelement;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int numFind=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		// TODO Auto-generated method stub
		for(int j=0;j<arr.length;j++) {
		    if(arr[j]==numFind) {
		    	System.out.println("Element Found");
		    }
		    
		}
	
		
		

	}
	

}

