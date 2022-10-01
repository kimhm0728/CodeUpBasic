package Basic100;
import java.util.Scanner;

public class Basic_1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int i = stdin.nextInt();
		stdin.close();
		String str;
		switch(i) {
		case 12:
		case 1:
		case 2:
			str = "winter";
			break;
		case 3:
		case 4:
		case 5:
			str = "spring";
			break;
		case 6:
		case 7:
		case 8:
			str = "summer";
			break;
		default:
			str = "fall";
		}
		
		System.out.println(str);
	}

}
