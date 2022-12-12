
public class Friend {
	String name;
	static int numberOfFriends;

	public Friend(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		numberOfFriends++;
	}

	static void displayFriends() {
		System.out.println("You have " + numberOfFriends + " friends");
	}
}
