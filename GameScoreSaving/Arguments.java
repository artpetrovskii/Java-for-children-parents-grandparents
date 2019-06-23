public class Arguments {
   public static void main(String[] args) {
	   if (args.length != 2) {
		   System.out.println("Please, enter parameters, for example: ");
		   System.out.println("java TestArguments xyz.gif 250");
		   System.exit(0);
	   }
   }
}
