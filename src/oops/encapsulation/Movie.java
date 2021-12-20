package oops.encapsulation;

public class Movie {
	
	private int duration;
	
	//encapsulation: data hiding 
	private String rating;
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {//G PG PG-13 R NR
		if(rating == "G" || rating == "PG" || rating == "PG-13" || rating == "R") {
			this.rating = rating;
		}else {
			this.rating = "NR";
		}
	}

	public void setDuration(int myDuration) {
		this.duration = myDuration;
	}
	
	public int getDuration() {
		return duration;
	}
	
	

}
