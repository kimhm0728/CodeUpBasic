package Basic100;
import java.util.Scanner;

public class Basic_1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		stdin.close();
		System.out.println((a>b?b:a)>c?c:(a>b?b:a));
	}

}
