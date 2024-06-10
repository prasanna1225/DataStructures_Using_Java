package rotatingarray;
import java.util.Arrays;
import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];	
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	   Arrays.sort(arr);
	   for(int i=0;i<arr.length;i++) {
	   System.out.println(arr[i]);
	   }
	}
}
		

	



