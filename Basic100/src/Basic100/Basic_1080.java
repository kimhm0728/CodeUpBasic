package Basic100;
import java.util.Scanner;

public class Basic_1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		stdin.close();
		int sum = 0;
		int i = 1;
		while(true) {
			sum+= i;
			if(sum>=input)
				break;
			i++;
		}
		System.out.println(i);
	}

}
