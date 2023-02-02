package filereaderandfilewriter;

import java.io.FileReader;
import java.io.FileWriter;

public class Program {
public static void main(String[] args) {
	try
	{
		int temp;
		String path1 = "/home/shashank/io/input.txt";
		String path2 = "/home/shashank/io/output.txt";
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		while((temp = fr.read())!=-1)
		{
			fw.write(temp);
		}
		
		fw.flush();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
