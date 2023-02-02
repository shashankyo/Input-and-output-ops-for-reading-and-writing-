package bufferedreaderandbufferedwriter1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {
public static void main(String[] args) {
	FileReader fr = null;
	FileWriter fw = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	try
	{
		String temp = null;
		String path1 = "/home/shashank/io/input.txt";
		String path2 = "/home/shashank/io/output.txt";
		fr = new FileReader(path1);
		fw = new FileWriter(path2);
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
		while((temp = br.readLine())!=null)
		{
			fw.write(temp);
		}
		bw.flush();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
