package Basic100;
import java.util.Scanner;

public class Basic_1096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int arr[][] = new int[19][19];
		
		for(int i=0;i<n;i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			arr[x-1][y-1] = 1;
		}
		stdin.close();

		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
