
public class Turtle {
			
	public String favoriteFood;
	public int numberOfFriends;

	Turtle(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
	void addFriend(){
		numberOfFriends+=1;
		
	}
	
	void setFood(String food) {
		favoriteFood = food;
	}
}
