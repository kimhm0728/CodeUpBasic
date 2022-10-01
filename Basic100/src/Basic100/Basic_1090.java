package Basic100;
import java.util.Scanner;

public class Basic_1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int r = stdin.nextInt();
		int n = stdin.nextInt();
		stdin.close();
		int result = a;
		for(int i=1;i<n;i++)
			result*=r;
		System.out.println(result);
	}

}
