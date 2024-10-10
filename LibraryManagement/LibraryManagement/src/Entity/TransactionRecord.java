package Entity;

import java.util.Date;

public class TransactionRecord {
	static long id=2000;
	String memberId;
	String bookTitle;
	String transactionType;
	Date transactionDate=new Date();
	public TransactionRecord(String memberId, String bookTitle, String transactionType) {
		
		this.memberId = memberId;
		this.bookTitle = bookTitle;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void displayTransaction()
	{
		System.out.println( "TransactionRecord= [memberId=" + memberId + ", bookTitle=" + bookTitle + ", transactionType=" + transactionType
				+ ", transactionDate=" + transactionDate + "]");
	}
	
	
}
