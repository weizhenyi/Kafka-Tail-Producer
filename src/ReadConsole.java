import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ReadConsole {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Process pro = Runtime.getRuntime().exec("cmd /c tail -f c:\\hivedata.txt");
		//pro.waitFor();
		Scanner scanner = new Scanner(pro.getInputStream());
		int nCount = 0;
		while ( scanner.hasNextLine()) 
		{
			String string =	scanner.nextLine();
			System.out.println(string);
			++nCount;
			System.out.println(nCount);
			// to put the string to your kafka producer .......
		}
		
		/*BufferedReader br= new BufferedReader(new InputStreamReader(pro.getInputStream() pro.getErrorStream())));
		String msg = null;
		while ((msg = br.readLine()) != null) {
			System.out.println(msg);
			
		}*/
		//Thread.sleep(2000);
	}
}
