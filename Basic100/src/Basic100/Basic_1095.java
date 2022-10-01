package Basic100;
import java.util.Scanner;

public class Basic_1095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int min = 23;

		for(int i=0;i<n;i++) {
			int a = stdin.nextInt();
			if(min > a)
				min = a;
		}
		System.out.println(min);
		stdin.close();

	}

}
