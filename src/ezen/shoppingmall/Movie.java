package ezen.shoppingmall;

public class Movie extends Item {

	private String director;
	private String actor;

	public Movie() {
	}

	public Movie(int id, String name, int price, String director, String actor) {
		super(id, name, price);
		this.director = director;
		this.actor = actor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + director + "\t" + actor;
	}

}
