import java.io.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = 
				new FileReader("D:/java-online-2/MyProj/src/FileReaderDemo.java");
		int n;
		while ((n = fr.read()) != -1)  //-1 indicates End Of File
		{
			System.out.print((char)n);
		}
		fr.close();
	}

}
