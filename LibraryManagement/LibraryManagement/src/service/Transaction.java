package service;

import java.util.ArrayList;

import Entity.TransactionRecord;

public class Transaction {
	private ArrayList<TransactionRecord> transactions=new ArrayList<TransactionRecord>();
	
	public void recordBorrowTransaction(String memberId,String bookTitle)
	{
		TransactionRecord transaction=new TransactionRecord(memberId, bookTitle, "Borrow");
		transactions.add(transaction);
		
		
	}
	public void recordreturnTransaction(String memberId,String bookTitle)
	{
		TransactionRecord transaction=new TransactionRecord(memberId, bookTitle, "return");
		transactions.add(transaction);
		
		
	}
	public void displayTransactions()
	{
	        System.out.println("All Transactions:");
	        for (TransactionRecord transaction : transactions) {
	            transaction.displayTransaction();
	        }
	}
}
