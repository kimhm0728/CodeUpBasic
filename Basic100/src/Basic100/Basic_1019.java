package Basic100;
import java.util.Scanner;

public class Basic_1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String ymd = stdin.next();
		String[] arr = ymd.split("\\.");
		
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		System.out.printf("%04d.%02d.%02d", y, m, d);
		
		stdin.close();
	}

}
