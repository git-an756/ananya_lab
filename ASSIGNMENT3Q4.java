package day2;
class ASSIGNMENT3Q4 {
	public static void main(String[] args) {

		}
	}


public class Book {
	private int id;
	private String sbn;
	private String title;
	private String author;
	private int price;

	public Book(int id, String sbn, String title, String author, int price) {
		this.id = id;
		this.sbn = sbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getSbn() {
		return sbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", sbn=" + sbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	
}
import java.util.*;
import java.io.*;

public class BookApp {
	private List<Book> books;

	public BookApp() {
		books = new ArrayList<Book>();
		init();
	}

	// reading the data from the file and populating the arraylist
	private void init() {
		String line = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(":");
				Book book = new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3],
						Integer.parseInt(tokens[4]));
				books.add(book);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Book searchBook(int bookId) {
		boolean isFond = false;
		Book bookFound = null;
		for (Book book : books) {
			if (book.getId() == bookId) {
				isFond = true;
				bookFound = book;
				break;
			}
		}
		if (isFond)
			return bookFound;
		else
			throw new BookNotFoundException();
	}

	public void sellBook(String isbn, int noOfCopies) {
	}

	public void purchageBook(String isbn, int noOfCopies) {

	}

}

public class BookNotFoundException extends RuntimeException{

}
public class NotSufficientBookException extends RuntimeException{

}


