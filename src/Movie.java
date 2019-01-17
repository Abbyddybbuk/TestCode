
public class Movie {
	private boolean starred;
	private String title;
	private Double rating;
	
	
	public Movie(String title, Double rating, boolean b) {
		super();
		this.starred = b;
		this.title = title;
		this.rating = rating;
	}
	
	public boolean getStarred() {
		return starred;
	}
	public void setStarred(boolean starred) {
		this.starred = starred;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
}
