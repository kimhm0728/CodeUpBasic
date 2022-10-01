package Basic100;
import java.io.*;

public class Basic_1024 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for(int i=0;i<s.length();i++)
			System.out.println("\'"+s.charAt(i)+"\'");
	}

}
