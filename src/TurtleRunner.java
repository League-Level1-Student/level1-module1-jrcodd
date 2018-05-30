
public class TurtleRunner {
public static void main(String[] args) {
	Turtle t = new Turtle("watrrrrrrr", 12);
	t.addFriend();
	t.setFood("watrrrrMelonzzzz");
	System.out.print("my turtle has " + t.numberOfFriends + " friends ");
	System.out.println("his favorite food is "+t.favoriteFood);
}
}
