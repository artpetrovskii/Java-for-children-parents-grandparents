public class FishMaster {
public static void main(String[] args) {
  Fish myFish1 = new Fish(20);
  // We'll try to put fish deeper than 100 metres 
  myFish1.dive(2);
  myFish1.dive(97);
  myFish1.dive(3);
  myFish1.sleep();
  }
}
