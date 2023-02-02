package bufferedreaderandbufferedwriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program {
public static void main(String[] args) {
	try
	{
		int temp;
		String path1 = "/home/shashank/io/input.txt";
		String path2 = "/home/shashank/io/output.txt";
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		while((temp = fis.read())!= -1)
		{
			fos.write(temp);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

