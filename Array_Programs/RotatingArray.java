package rotatingarray;
import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		// TODO Auto-generated method stub
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}

	}

}
