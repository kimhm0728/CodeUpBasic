package Basic100;
import java.util.Scanner;

public class Basic_1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		while(true) {
			char c = stdin.next().charAt(0);
			System.out.println(c);
			if(c=='q')
				break;
		}
		stdin.close();
	}

}
