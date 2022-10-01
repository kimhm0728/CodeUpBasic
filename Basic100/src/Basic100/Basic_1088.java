package Basic100;
import java.util.Scanner;

public class Basic_1088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		stdin.close();
		for(int i=1;i<=input;i++) {
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}

	}

}
