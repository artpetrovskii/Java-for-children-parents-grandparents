public class Pet {
  int age;
  float weight;
  float height;
  String color;
  
  public void sleep() {
	 System.out.println("Good night! To tomorrow!"); 
  }
  
  public void eat(){System.out.println(
		  "I am very hungry, let's eat chips!");
  }
  
  public String say(String aWord) {
	 String petResponse = "Ok!" + aWord;
	 return petResponse;
  }
}
