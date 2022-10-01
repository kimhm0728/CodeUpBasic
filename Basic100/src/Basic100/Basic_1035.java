package Basic100;
import java.util.Scanner;

public class Basic_1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		stdin.close();
		int i = Integer.parseInt(s, 16);
		System.out.printf("%o", i);
	}

}
