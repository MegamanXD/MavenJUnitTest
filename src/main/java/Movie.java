import java.util.Date;

public class Movie {
    //Properties
    private int id;

    private String coverPicture;
    private String movieName;
    private String directors;
    private String cast;
    private String category;
    private Date premiere;

    private int duration;
    private String language;
    private String rated;
    private String description;

    //Constructors
    public Movie() { }

    public Movie(String coverPicture, String movieName, String directors, String cast, String category, Date premiere, int duration, String language, String rated, String description) {
        this.coverPicture = coverPicture;
        this.movieName = movieName;
        this.directors = directors;
        this.cast = cast;
        this.category = category;
        this.premiere = premiere;
        this.duration = duration;
        this.language = language;
        this.rated = rated;
        this.description = description;
    }

    //Getters
    public int getId() { return id; }
    public String getCoverPicture() { return coverPicture; }
    public String getMovieName() { return movieName; }
    public String getDirectors() { return directors; }
    public String getCast() { return cast; }
    public String getCategory() { return category; }
    public Date getPremiere() { return premiere; }
    public int getDuration() { return duration; }
    public String getLanguage() { return language; }
    public String getRated() { return rated; }
    public String getDescription() { return description; }

    //Setters
    public void setId(int id) { this.id = id; }
    public void setCoverPicture(String coverPicture) { this.coverPicture = coverPicture; }
    public void setMovieName(String movieName) { this.movieName = movieName; }
    public void setDirectors(String directors) { this.directors = directors; }
    public void setCast(String cast) { this.cast = cast; }
    public void setCategory(String category) { this.category = category; }
    public void setPremiere(Date premiere) { this.premiere = premiere; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setRated(String rated) {
        this.rated = rated;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //toString
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", coverPicture='" + coverPicture + '\'' +
                ", movieName='" + movieName + '\'' +
                ", directors='" + directors + '\'' +
                ", cast='" + cast + '\'' +
                ", category='" + category + '\'' +
                ", premiere=" + premiere +
                ", duration=" + duration +
                ", language='" + language + '\'' +
                ", rated='" + rated + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
