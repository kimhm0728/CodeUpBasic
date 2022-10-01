package Basic100;
import java.util.Scanner;

public class Basic_1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		stdin.close();
		int x = Integer.parseInt(s, 16);
		for(int i=1;i<16;i++)
			System.out.printf("%X*%X=%X\n", x, i, x*i);
	}

}
