package Day2_ProgrammingElement.Level1;

class Bbook {
    public String ISBN;
    protected String title;
    private String author;

    Bbook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
}

class EBook extends Bbook {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayResults() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Basics", "Ram");
        ebook.displayResults();

        ebook.setAuthor("Shyam");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
