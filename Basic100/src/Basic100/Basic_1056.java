package Basic100;
import java.util.Scanner;

public class Basic_1056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		stdin.close();
		if(a!=b) 
			System.out.println("1");
		else
			System.out.println("0");
	}

}
