package Basic100;
import java.io.*;

public class Basic_1025 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String str = "0";
		str = "1"+str.repeat(s.length()-1);
		int a = Integer.parseInt(str);
		
		for(int i=0;i<s.length();i++) {
			System.out.println("["+(s.charAt(i)-'0')*a+"]");
			a/=10;
		}
	}

}
