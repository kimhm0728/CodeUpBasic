package Basic100;
import java.util.Scanner;

public class Basic_1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		stdin.close();
		int sum = 0;
		int i = 1;
		while(true) {
			if(sum>=input) {
				System.out.println(sum);
				break;
			}
			sum+= i++;
		}
	}

}
