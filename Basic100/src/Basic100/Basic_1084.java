package Basic100;
import java.util.Scanner;

public class Basic_1084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		stdin.close();
		int cnt = 0;
		
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
				for(int k=0;k<c;k++) {
					System.out.println(i+" "+j+" "+k);
					cnt++;
				}
		System.out.println(cnt);
	}

}
