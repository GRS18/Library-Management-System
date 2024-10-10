package Entity;

public class Book {
	String title;
	String auther;
	String category;
	boolean availability;
	public Book(String title, String auther, String category, boolean availability) {
		this.title = title;
		this.auther = auther;
		this.category = category;
		this.availability = availability;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	

}
