package Basic100;
import java.util.Scanner;

public class Basic_1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int w = stdin.nextInt();
		int h = stdin.nextInt();
		int[][] arr = new int[w][h];
		
		int n = stdin.nextInt();
		for(int i=0;i<n;i++) {
			int l = stdin.nextInt();
			int d = stdin.nextInt();
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			
			for(int j=0;j<l;j++) 
				if(d == 0)
					arr[x-1][y-1+j] = 1;
				else if(d == 1)
					arr[x-1+j][y-1] = 1;
		}
		stdin.close();
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
