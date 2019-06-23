import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {
   public static void main(String[] args) {
	   int somedata[] = {56,230,123,43,11,37};
	   FileOutputStream myFile = null;
	   BufferedOutputStream buff = null;
	   try {
		   myFile = new FileOutputStream("xyz.dat");
		   buff = new BufferedOutputStream(myFile);
		   for (int i = 0; i <somedata.length; i++) {
			buff.write(somedata[i]);
		   }
	   } catch (IOException e) {
		   System.out.println("Impossible to write in file: " + e.toString());
	   } finally {
		   try {
			   buff.flush();
			   buff.close();
			   myFile.close();
		   } catch (Exception e1) {
			   e1.printStackTrace();
		   }
	   }
   }
}
