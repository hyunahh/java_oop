package ezen.shoppingmall;

public class Album extends Item {

	private String artist;

	public Album() {
	}

	public Album(int id, String name, int price, String artist) {
		super(id, name, price);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + artist;
	}

}
