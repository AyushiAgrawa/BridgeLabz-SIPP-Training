package Day1_DSAProgrammingElements;
class MovieNode{
	String movieTitle;
	String Director;
	int yearOfRelease;
	double rating;
	MovieNode next, prev;
	
	public MovieNode(String movieTitle, String Director, int yearOfRelease, double rating) {
		this.movieTitle = movieTitle;
		this.Director = Director;
		this.yearOfRelease=yearOfRelease;
		this.rating = rating;
		this.next = this.prev = null;
	}
}


public class MovieManagementSystem {
	MovieNode head;
	MovieNode tail;
	
	void addFirst(String movieTitle, String Director, int yearOfRelease, double rating) {
		MovieNode newNode = new MovieNode(movieTitle, Director, yearOfRelease, rating);
		if(head == null) {
			head = tail = newNode;
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	void addLast(String movieTitle, String Director, int yearOfRelease, double rating) {
		MovieNode newNode = new MovieNode(movieTitle, Director, yearOfRelease, rating);
		if(tail == null) {
			head = tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
    
	void atposition(String movieTitle, String Director, int yearOfRelease, double rating, int pos) {
		if(pos<=1 || head == null) {
			addFirst(movieTitle, Director, yearOfRelease, rating);
			return;
		}
		MovieNode newNode = new MovieNode(movieTitle, Director, yearOfRelease, rating);
		MovieNode curr = head;
		int i=1;
		while(curr.next != null && i < pos-1) {
			curr = curr.next;
			i++;
		}
		if(curr.next == null) {
			addLast(movieTitle, Director, yearOfRelease, rating);
		}else {
			newNode.next = curr.next;
			newNode.prev = curr;
			curr.next.prev = newNode;
			curr.next = newNode;
		}
	}
	
	void remove(String Title) {
		MovieNode curr = head;
		while(curr != null) {
			if(curr.movieTitle.equals(Title)) {
				if(curr==head) {
					head = curr.next;
					if(head != null) {
						head.prev = null;
					}else {
						tail = null;
					}
				}else if(curr == tail) {
				        tail =curr.prev;
				        if(tail != null ) tail.next = null;
			    }else {
				    curr.prev.next = curr.next;
				    curr.next.prev = curr.prev;
			    }
				System.out.println(Title + " removed.");
	            return;
			}
	        curr = curr.next;
		}
		System.out.println(Title + " not found.");
	}
	
	boolean searchByDirector(String director) {
		MovieNode curr = head;
		while(curr != null) {
			if(curr.Director.equals(director)) {
				System.out.println(curr.movieTitle + " | " + curr.Director + " | " + curr.yearOfRelease + " | " + curr.rating);
	            return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	boolean searchByRating(double rating) {
		MovieNode curr = head;
		while(curr != null) {
			if(curr.rating == rating) {
				System.out.println(curr.movieTitle + " | " + curr.Director + " | " + curr.yearOfRelease + " | " + curr.rating);
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	void updateByRating(String movieTitle, double newRating) {
		MovieNode curr = head;
		while(curr != null) {
			if(curr.movieTitle.equals(movieTitle)) {
				curr.rating = newRating;
				System.out.println("Updated rating: "+ newRating);
				return;
			}
			curr = curr.next;
		}
		System.out.println("Not found");
	}
	
	void displayForward() {
		MovieNode curr = head;
		while(curr != null) {
			System.out.println(curr.movieTitle + " | " + curr.Director + " | " + curr.yearOfRelease + " | " + curr.rating);
			curr = curr.next;
		}
	}
	
	void displayBackward() {
		MovieNode curr = tail;
		while(curr != null) {
			System.out.println(curr.movieTitle + " | " + curr.Director + " | " + curr.yearOfRelease + " | " + curr.rating);
			curr = curr.prev;
		}
	}
	
	public static void main(String[] args) {
		MovieManagementSystem list = new MovieManagementSystem();
		list.addFirst("one piece", "Momoru hosoda", 2010, 8.7);
		list.addLast("Attack on Titan", "Yuzuru Tachikawa", 2010, 9.0);
		list.atposition("I want to eat your pancreas", "Tomoyuki Itamura", 2015, 8.2, 2);
		System.out.println();
		list.searchByDirector("Yuzuru Tachikawa");
		list.searchByRating(8.7);
		System.out.println();
		list.updateByRating("I want to eat your pancreas", 8.5);
		System.out.println();
		list.displayBackward();
		list.displayForward();
		System.out.println();
		list.remove("Attack on Titan");
		
	}
}
