package Basic100;
import java.util.Scanner;

public class Basic_1097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int arr[][] = new int[19][19];
		
		for(int i=0;i<19;i++) {
			String str = stdin.nextLine();
			String[] strArr = str.split(" ");
			for(int j=0;j<19;j++)
				arr[i][j] = Integer.parseInt(strArr[j]);
		}
		
		int n = stdin.nextInt();
		
		for(int i=0;i<n;i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			for(int j=0;j<19;j++)
				arr[j][x-1]=arr[j][x-1]==0?1:0;
			for(int k=0;k<19;k++) 
					arr[y-1][k]=arr[y-1][k]==0?1:0;
					
		}
		stdin.close();

		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
