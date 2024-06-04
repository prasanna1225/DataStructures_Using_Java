package sumofarray;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		// TODO Auto-generated method stub
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
		}
		
		System.out.println(sum);

	}
	

}
