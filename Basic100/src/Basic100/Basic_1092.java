package Basic100;
import java.util.Scanner;

public class Basic_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		stdin.close();
		for(int i=Math.max(Math.max(a, b), c); ;i++) 
			if(i%a==0 && i%b==0 && i%c==0) {
				System.out.println(i);
				break;
			}

	}

}
