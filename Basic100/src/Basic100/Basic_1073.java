package Basic100;
import java.util.Scanner;

public class Basic_1073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int i;
		while(true) {
			i = stdin.nextInt();
			if(i==0)
				break;
			System.out.println(i);
		}
		stdin.close();
	}

}
