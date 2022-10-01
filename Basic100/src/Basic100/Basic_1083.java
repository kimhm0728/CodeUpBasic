package Basic100;
import java.util.Scanner;

public class Basic_1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int input = stdin.nextInt();
		stdin.close();
		for(int i=1;i<=input;i++)
			if(i==3 || i==6 || i==9)
				System.out.print("X ");
			else
				System.out.print(i+" ");
	}

}
