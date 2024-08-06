import java.io.*;
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "Welcome to Java";
		bw.write(s);
		System.out.println("File Created");
		bw.close();
		fw.close();
	}

}
