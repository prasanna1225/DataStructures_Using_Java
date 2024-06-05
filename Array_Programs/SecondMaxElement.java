package secondmaxelement;
import java.util.Scanner;

public class SecondMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int max1=arr[0],max2=arr[0];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if (max1<arr[j]) {
				max2=max1;
				max1=arr[j];
				
			}
			else if( max2<arr[j]) {
				max2=arr[j];
			}
		}
		System.out.println("Second Max element is "+ max2);
		

	}

}

