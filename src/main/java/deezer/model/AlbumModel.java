package deezer.model;

public class AlbumModel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String title;
    private String upc;
    private String link;
    private String cover;
    private String genre_id;
    private String label;
    private Integer duration;
    private Integer fans;
    private Integer rating;
    private String release_date;
    private Boolean available;
    private ArtistModel artist;
    private String type;
    private String approved_type;
    private String language;
    private String genre;
    private Integer nb_tracks;
    private AlbumModel alternative;
    private String record_type;
    private String tracklist;
    
    //getters and setters
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(String genre_id) {
		this.genre_id = genre_id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getFans() {
		return fans;
	}
	public void setFans(Integer fans) {
		this.fans = fans;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public ArtistModel getArtist() {
		return artist;
	}
	public void setArtist(ArtistModel artist) {
		this.artist = artist;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApproved_type() {
		return approved_type;
	}
	public void setApproved_type(String approved_type) {
		this.approved_type = approved_type;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getNb_tracks() {
		return nb_tracks;
	}
	public void setNb_tracks(Integer nb_tracks) {
		this.nb_tracks = nb_tracks;
	}
	public AlbumModel getAlternative() {
		return alternative;
	}
	public void setAlternative(AlbumModel alternative) {
		this.alternative = alternative;
	}
	public String getRecord_type() {
		return record_type;
	}
	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}
	public String getTracklist() {
		return tracklist;
	}
	public void setTracklist(String tracklist) {
		this.tracklist = tracklist;
	}

}
