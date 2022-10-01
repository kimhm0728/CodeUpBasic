package Basic100;
import java.util.Scanner;

public class Basic_1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) 
			arr[i] = stdin.nextInt();
		
		stdin.close();
		for(int i=n-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}

}
