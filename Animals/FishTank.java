import java.util.ArrayList;

public class FishTank {
   public static void main(String[] args) {
	   ArrayList fishTank = new ArrayList();
	   Fish theFish1;
	   Fish aFish = new Fish(20);
	   aFish.color = "red one";
	   aFish.weight = 2;
	   fishTank.add(aFish);
	   aFish = new Fish(10);
	   aFish.color = "green one";
	   aFish.weight = 5;
	   fishTank.add(aFish);
	   int fishCount = fishTank.size();
	   for (int i = 0; i < fishCount; i++) {
		   theFish1 = (Fish) fishTank.get(i);
		   System.out.println("Caught " + theFish1.color + " fish with a weight of " + 
		                      theFish1.weight + " kg. Deep: " + theFish1.currentDepth);
	   }
   }
}
