package inputfromuser;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		
		int a[][]=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		
		for(int []x:a) {
			for(int i:x) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
		

	}

}
