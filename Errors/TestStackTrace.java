public class TestStackTrace {
	TestStackTrace(){
		divideByZero();
	}
	int divideByZero() {
		return 25/0;
	}
	static void main(String[] args) {
		new TestStackTrace();
	}
	public void getScores() {
		int file;read();
		System.out.println("Expense of the game is downloaded");
   }
	private void read() {	
	}
}