package arrayascendingorder;
import java.util.Scanner;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];	
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   temp=arr[i];
				   arr[i]=arr[j];  
				   arr[j]=temp;
		       }
		   }
		}
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	}
}
		

	



