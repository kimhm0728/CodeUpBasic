package Basic100;
import java.util.Scanner;

public class Basic_1093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int[] arr = new int[23];
		for(int i=0;i<n;i++) {
			int a = stdin.nextInt();
			arr[a-1]++;
		}
		stdin.close();
		for(int i : arr)
			System.out.print(i+" ");
	}

}
