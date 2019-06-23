import java.io.IOException;

public class MySuperGame {
	void getAllScores() throws IOException{
		int file;read();
	}
	private void read() {	
	}
	public static void main(String[] args) {
		MySuperGame msg = new MySuperGame();
		System.out.println("Results of the game");
		try {
		msg.getAllScores();
		}catch(IOException e) {
			System.out.println("Sorry, but results of the game are unavailable");
		}
	}
}
