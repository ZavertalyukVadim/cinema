package p1.models;


import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name="url")
    private UrlOfFilm url;
    @ManyToOne
    @JoinColumn(name="film_id")
    private Films films;
    private String time;
    @ManyToOne
    @JoinColumn(name="genre")
    private  Genre genre;
    @ManyToOne
    @JoinColumn(name="premiere_id")
    private Premiere premiere;
    @ManyToOne
    @JoinColumn(name="hall_id")
    private Actors actors;
    private String durationOfFilm;
    private String informationOfFilm;
    @ManyToOne
    @JoinColumn(name="nameOfHall")
    private Hall hall;




    public Student() {
    }

    public Student( UrlOfFilm url, Films films,String time ,Genre genre, Premiere premiere,  Actors actors, String durationOfFilm,String informationOfFilm,Hall hall) {
        this.films = films;
        this.premiere = premiere;
        this.time = time;
        this.actors = actors;
        this.url = url;
        this.genre =  genre;
        this.durationOfFilm=durationOfFilm;
        this.informationOfFilm=informationOfFilm;
        this.hall=hall;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDurationOfFilm() {
        return durationOfFilm;
    }

    public void setDurationOfFilm(String durationOfFilm) {
        this.durationOfFilm = durationOfFilm;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public String getInformationOfFilm() {
        return informationOfFilm;
    }

    public void setInformationOfFilm(String informationOfFilm) {
        this.informationOfFilm = informationOfFilm;
    }


    public UrlOfFilm getUrl() {
        return url;
    }

    public void setUrl(UrlOfFilm url) {
        this.url = url;
    }

     public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public Films getFilms() {
        return films;
    }

    public void setFilms(Films films) {
        this.films = films;
    }

    public Premiere getPremiere() {
        return premiere;
    }

    public void setPremiere(Premiere premiere) {
        this.premiere = premiere;
    }

    public Actors getActors() {
        return actors;
    }

    public void setActors(Actors actors) {
        this.actors = actors;
    }
}
