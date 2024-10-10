package Entity;

import java.util.ArrayList;

public class Member {
	static long id=1000;
	String name;
	String memberId;
	ArrayList<Book> borrowedBooks = new ArrayList<Book>();
	
	public Member(String name, String memberId) {
		
		this.name = name;
		this.memberId = "MID"+ ++id;
		this.borrowedBooks = new ArrayList<Book>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	
	public void borrowBook(Book book)
	{
		if(book.isAvailability())
		{
			borrowedBooks.add(book);
			book.setAvailability(false);
			System.out.println("Borrowed book= "+book.getTitle());
		}
		else
		{
			System.out.println("Book "+book.getTitle()+" not available");
		}
	}
	public void returnBook(Book book)
	{
		if(borrowedBooks.contains(book))
		{
			borrowedBooks.remove(book);
			book.setAvailability(true);
			System.out.println("Returned nook "+book.getTitle());
		}
		else
		{
			System.out.println("Book "+book.getTitle()+" is Available");
		}
	}
	
}
