import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteReader {
   public static void main(String[] args) {
	   FileInputStream myFile = null;
	   BufferedInputStream buff = null;
	   try {
		   myFile = new FileInputStream("abc.dat");
		   buff = new BufferedInputStream(myFile);
		   while (true) {
			   int ByteValue = buff.read();
			   System.out.print(ByteValue + " ");
			   if (ByteValue == -1) {
				   break;
			   }
		   }
	   } catch (IOException e) {
		   e.printStackTrace();
	   } finally {
		   try {
			   buff.close();
			   myFile.close();
		   } catch (Exception e1) {
			   e1.printStackTrace();
		   }
	   }
   }
}
