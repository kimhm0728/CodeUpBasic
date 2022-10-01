package Basic100;
import java.util.Scanner;

public class Basic_1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int arr[][] = new int[10][10];
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				arr[i][j] = stdin.nextInt();
		stdin.close();
		
		int x = 1;
		int y = 1;
		arr[x][y] = 9;
		while(true) {
			if(x==9 && y==9)
				break;
			
			if(y+1<10) {
				if(arr[x][y+1]==0) { 
					arr[x][++y]=9;
					continue;
				}
				else if(arr[x][y+1]==2) {
					arr[x][++y]=9;
					break;
				}
			}
			if(x+1<10) {
				if(arr[x+1][y]==0) {
					arr[++x][y]=9;
					continue;
				}
				else if(arr[x+1][y]==2) {
					arr[++x][y]=9;
					break;
				}
			}
			else
				break;
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		} 
	}

}
