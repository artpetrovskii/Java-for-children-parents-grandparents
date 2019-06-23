import java.io.FileWriter; 
import java.io.BufferedWriter; 
import java.io.IOException; 
import java.util.Date;

public class ScoreWriter2{ 
	public static void main(String[] args) {    
		FileWriter myFile = null;       
		BufferedWriter buff = null;  
		Date today = new Date();       
		Score scores[] = new Score[3]; 
		
		scores[0] = new Score();        
		scores[0].setFirstName("�������");       
		scores[0].setLastName("�������");       
		scores[0].setScore(250);       
		scores[0].setPlayDate(today); 
   
		scores[1] = new Score();        
		scores[1].setFirstName("����");       
		scores[1].setLastName("�������");       
		scores[1].setScore(300);       
		scores[1].setPlayDate(today);
		
		scores[2]=new Score();       
		scores[2].setFirstName("������");
		scores[2].setLastName("�������");       
		scores[2].setScore(190);       
		scores[2].setPlayDate(today);    
		try {  
			myFile = new FileWriter("c:\\scores2.txt");       
			buff = new BufferedWriter(myFile);   
			for (int i=0; i < scores.length; i++) {
				buff.write(scores[i].toString());        
				System.out.println("������  " + scores[i].getLastName() );       
				}     
			System.out.println("������ ����� ���������");          
			}catch (IOException e){      
				e.printStackTrace();   
				} finally {      
					try{         
			buff.flush();          
			buff.close();         
			myFile.close();     
			}catch(IOException e1){         
			e1.printStackTrace();      
			}    
	  }
    }
}
