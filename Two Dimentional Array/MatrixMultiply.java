package matrixsum;
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int ab[][]=new int[r][c];
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				for(int k=0;k<r;k++) {
				ab[i][j]=ab[i][j]+a[i][k]*b[k][j];	
				}
			
			}
		}
		
		
		
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ab[i][j] + " ");
            }
            System.out.println();
        }
		
		

	}

}

