
public class Runner {
public static void main(String[] args) {
	Tacos taco = new Tacos("fish", "verde muey malo");
	System.out.println(taco.getMeat());
	System.out.println(taco.getSauce());
	taco.setMeat("chicken");
	taco.setSauce("verde muey bueno");
	System.out.println(taco.getMeat());
	System.out.println(taco.getSauce());
}
}
