package Basic100;
import java.util.Scanner;

public class Basic_1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		stdin.close();
		int sum=0;
		for(int i=2;i<=input;i++)
			if(i%2==0)
				sum+=i;
		System.out.println(sum);
	}

}
