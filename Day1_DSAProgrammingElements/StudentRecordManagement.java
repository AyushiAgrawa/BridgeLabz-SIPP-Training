package Day1_DSAProgrammingElements;
class Node{
	int rollNumber;
	String name;
	int age;
	String grade;
	Node next;
	
	public Node(int rollNumber, String name, int age, String grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}	
}

class StudentLinkedList{
	Node head;
	
	void addatbegining(int rollNumber, String name, int age, String grade){
		Node newnode = new Node(rollNumber, name, age, grade);
		newnode.next = head;
		head = newnode;
	}
	
	void addatend(int rollNumber, String name, int age, String grade) {
		Node newnode = new Node(rollNumber, name, age, grade);
		if(head == null) {
			head=newnode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newnode;
	}
	
	void addatspecificposition(int pos, int rollNumber, String name, int age, String grade) {
	     if(pos < 1) {
	    	 System.out.println("Invalid position");
	    	 return;
	     }
	     else if(pos == 1) {
	    	 addatbegining(rollNumber, name, age, grade);
	    	 return;
	     }
	     Node newnode = new Node(rollNumber, name, age, grade);
	     Node current = head;
	     for(int i=1; i<pos-1 && current != null; i++) {
	    	 current = current.next; 
	     }
	     if (current == null) {
	         System.out.println("Position out of bounds!");
	         return;
	     }
	     newnode.next = current.next;
	     current.next = newnode;
	}
	
	void deletebyrollNumber(int rollNumber) {
		if(head==null) {
			return;
		}
		if(head.rollNumber == rollNumber) {
			head = head.next;
			return;
		}
		Node current = head;
	    while (current.next != null && current.next.rollNumber != rollNumber) {
	        current = current.next;
	    }
	    if (current.next == null) {
	        System.out.println("Student not found!");
	        return;
	    }
	    current.next = current.next.next; 
	    System.out.println("Student record deleted.");
	}
	
	public void searchByRollNumber(int rollNumber) {
	    Node current = head;
	    while (current != null) {
	        if (current.rollNumber == rollNumber) {
	            System.out.println("Student found: Roll: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
	            return;
	        }
	        current = current.next;
	    }
	    System.out.println("Student not found!");
	}
    
	public void displayAll() {
	    if (head == null) {
	        System.out.println("No records to display.");
	        return;
	    }
	    Node current = head;
	    while (current != null) {
	        System.out.println("Roll: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
	        current = current.next;
	    }
	}
    
	public void updateGrade(int rollNumber, String newGrade) {
	    Node current = head;
	    while (current != null) {
	        if (current.rollNumber == rollNumber) {
	            current.grade = newGrade;
	            System.out.println("Grade updated successfully.");
	            return;
	        }
	        current = current.next;
	    }
	    System.out.println("Student not found!");
	}

}
public class StudentRecordManagement {

	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();

        list.addatbegining(1, "Alice", 20, "A");
        list.addatend(2, "Bob", 21, "B");
        list.addatspecificposition(2, 3, "Charlie", 22, "C");

        list.displayAll();
        list.searchByRollNumber(2);
        list.updateGrade(1, "A");
        list.deletebyrollNumber(3);
        list.displayAll();

	}

}
