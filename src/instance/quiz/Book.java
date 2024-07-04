package instance.quiz;

public class Book {
	String bookName;
	int bookPrice;
	String Publisher;
	int bookPage;
	
	public void showBookInfo() {
		System.out.println(bookName+", "+bookPrice+", "+Publisher+", "+bookPage);
	}
}
