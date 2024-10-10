package service;

import java.util.HashMap;

import Entity.Book;
import Entity.Member;

public class Library {
	HashMap<String , Book > books;
	HashMap<String , Member > members;
	public Library() {
		books=new HashMap<String, Book>();
		members=new HashMap<String, Member>();
	}
	public void addBook(Book book) 
	{
		books.put(book.getTitle(), book);
		System.out.println("Book added Successfully");
	}
	public void removeBook(String title)
	{
		books.remove(title);
		System.out.println("Book removed Successfully");
	}
	Book searchBookByTitle(String title)
	{
		
		return books.get(title);
	}
	public void addMember(Member member) 
	{
		members.put(member.getMemberId(), member);
		System.out.println("Member added Successfully");
	}
	public void displayAllBooks()
	{
		System.out.println("All Books in the Library:");
		for (Book book : books.values()) {
			System.out.println("Title: " + book.getTitle() + ", Author: "+book.getAuther()+" Category: "+book.getCategory());
		}
	}
	
	public void displayAllMembers()
	{
		System.out.println("All Members in the Library:");
		for (Member member : members.values()) 
		{
			System.out.println("Member: " + member.getName() + ", Member ID: " + member.getMemberId());
		}
	}
	public void borrowBook(String memberId,String bookTitle)
	{
		Member member=members.get(memberId);
		Book book=books.get(bookTitle);
		if(member!=null && book!=null)
		{
			member.borrowBook(book);
			
		}
		
	}	
	public void returnBook(String memberId,String bookTitle)
	{
		Member member=members.get(memberId);
		Book book=books.get(bookTitle);
		if(member!=null && book!=null)
		{
			member.returnBook(book);
		}
		
	}
	
}
