import java.text.SimpleDateFormat;
import java.util.Date;

public class Song {
	//fill the code
	
	
	private String name;
	private String artist;
	private String songType;
	private double rating;
	
	private int numberOfDownload;
	private Date dateDownloaded;
	public Song() {
		super();
	}
	public Song(String name, String artist, String songType, double rating, int numberOfDownload, Date dateDownloaded) {
		super();
		this.name = name;
		this.artist = artist;
		this.songType = songType;
		this.rating = rating;
		this.numberOfDownload = numberOfDownload;
		this.dateDownloaded = dateDownloaded;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSongType() {
		return songType;
	}
	public void setSongType(String songType) {
		this.songType = songType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNumberOfDownload() {
		return numberOfDownload;
	}
	public void setNumberOfDownload(int numberOfDownload) {
		this.numberOfDownload = numberOfDownload;
	}
	public Date getDateDownloaded() {
		return dateDownloaded;
	}
	public void setDateDownloaded(Date dateDownloaded) {
		this.dateDownloaded = dateDownloaded;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "Name:" + name + "\nArtist:" + artist + "\nSong Type:" + songType + "\nRating:" + rating
				+ "\nNumber of Downloads" + numberOfDownload + "\nDate Downloaded:" +sdf.format(dateDownloaded);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((songType == null) ? 0 : songType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equalsIgnoreCase(other.artist))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equalsIgnoreCase(other.name))
			return false;
		if (songType == null) {
			if (other.songType != null)
				return false;
		} else if (!songType.equalsIgnoreCase(other.songType))
			return false;
		return true;
	}
	
	
	
}
