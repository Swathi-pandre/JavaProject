package library;

public class Book {
	private String title;
	private String author;
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	public void displaybookinfo() {
		System.out.println("Title is: "+title+"Author is: "+author);
	}

}
