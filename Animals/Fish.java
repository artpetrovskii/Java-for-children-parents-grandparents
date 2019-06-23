public class Fish extends Pet{
int currentDepth = 0;
Fish(int currentDepth){
    this.currentDepth = currentDepth;
	}
void Fish(int startingPosition) {
	currentDepth=startingPosition;
}
public int dive(int howDeep){
	currentDepth=currentDepth + howDeep;
	if (currentDepth > 100) {
		System.out.println("I am a small fish "+
	              " and can't dive deeper than 100 metres");
	    currentDepth = currentDepth - howDeep;
	}else{
	System.out.println("Diving to the bottom " + howDeep + 
			                                   " metres");
	System.out.println("I am " + currentDepth + 
			        " metres under sea level");
	}
	return currentDepth;
}
    public String say(String something) {
	return "Don't you know that fish don't speak?";
    }
}
