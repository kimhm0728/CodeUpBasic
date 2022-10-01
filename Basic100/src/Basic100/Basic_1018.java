package Basic100;
import java.util.Scanner;

public class Basic_1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		String[] arr = s.split(":");
		
		int h = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		System.out.println(h+":"+m);
		stdin.close();
	}

}
