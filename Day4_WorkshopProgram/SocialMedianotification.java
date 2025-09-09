package Day4_WorkshopPrograms;
import java.util.*;

abstract class Notification{
	String message;
	Notification(String message){
		this.message = message;
	}
	
	abstract void display();
}

class LikeNotification extends Notification{

	LikeNotification(String message) {
		super(message);
	}

	@Override
	void display() {
		System.out.println("Like: "+ message);
	}
	
}

class CommentNotification extends Notification{

	CommentNotification(String message) {
		super(message);
	}

	@Override
	void display() {
		System.out.println("Comment: "+ message);
	}
	
}

class Userfeed{
	private LinkedList<Notification> feed = new LinkedList<>();
	
	void addNotification(Notification notification) {
		feed.addFirst(notification);
	}
	
	void displayFeed() {
		System.out.println("All Notifications: ");
		for(Notification n : feed) {
			n.display();
		}
	}
}
public class SocialMedianotification {

	public static void main(String[] args) {
		Userfeed uf = new Userfeed();
		uf.addNotification(new LikeNotification("Ayesha liked your posts."));
		uf.addNotification(new CommentNotification("Mohan commented on your posts"));
		uf.displayFeed();
	}

}
