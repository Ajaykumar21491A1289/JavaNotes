import java.io.*;
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("file1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Java is OO programming Language";
		bos.write(s.getBytes());
		System.out.println("File Created");
		bos.close();
		fos.close();

	}

}
