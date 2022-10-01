package Basic100;
import java.util.Scanner;

public class Basic_1066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		stdin.close();
		String[] arr = s.split(" ");
		for(int i=0;i<3;i++) {
			int tmp = Integer.parseInt(arr[i]);
			if(tmp%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}

}
