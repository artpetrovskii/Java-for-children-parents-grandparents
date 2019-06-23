import java.io.File;
import java.io.*;

public class ScoreList{
public static void getAllScores() throws Exception{
	try {
	int file;read();
	} catch (Exception e) {
		throw new Exception("Dear friend, in file Scores are problems.");
	}
}
	private static void read() {	
}
	public static void main(String[] args){
		 System.out.println("Scores");
		 try{
		 getAllScores();
	 }catch(Exception e1){
		   System.out.println(e1.getMessage());
	 }
	}
}
		
