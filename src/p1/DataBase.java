package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import p1.models.*;

import java.util.List;

public class DataBase {
    private List<Student> studs;
    private List<Genre> genresList;
    private  List<Actors> actorsList;
    private List<Premiere>  premiereList;
    private List<Films> filmsList;
    private List<UrlOfFilm> urlList;
    private List<Hall> hallList;
    static AnnotationConfiguration configuration;
    static SessionFactory sf;
    Session session;

    public DataBase() {
        System.out.println("Opening db connection");
        if (sf==null) {
            configuration = new AnnotationConfiguration();
            configuration.configure();
            sf = configuration.buildSessionFactory();
        }
        session = sf.openSession();
    }
    public void readUrl() {urlList=session.createQuery("from  p1.models.UrlOfFilm").list(); }
    public void readStuds(){ studs = session.createQuery("from p1.models.Student").list(); }
    public void readActrors(){
        actorsList = session.createQuery("from p1.models.Actors").list();
    }
    public void readGenres(){
        genresList = session.createQuery("from p1.models.Genre").list();
    }
    public  void readPremiere(){
        premiereList= session.createQuery("from p1.models.Premiere").list();
    }
    public void readFilms(){
        filmsList=session.createQuery("from p1.models.Films").list();
    }
    public void readhall(){hallList=session.createQuery("from p1.models.Hall").list();}

    public void addStudent( UrlOfFilm url, Films films,String time ,Genre genre, Premiere premiere,  String actorName,String durationOfFilm,String informationOfFilm, Hall hall   ){
        session.beginTransaction();

        Actors actor = new Actors();
        actor.setNameOfActors(actorName);
        Student newStud = new Student(url,films,time,genre,premiere,actor,durationOfFilm ,informationOfFilm , hall  );

        session.save(newStud);
        session.getTransaction().commit();
    }

    public void deleteStudent(int id){
        session.beginTransaction();
        Student student = (Student) session.createQuery("from p1.models.Student s where s.id="+id).list().get(0);
        session.delete(student);
        session.getTransaction().commit();
    }


    public List<UrlOfFilm> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<UrlOfFilm> urlList) {
        this.urlList = urlList;
    }

    public List<Films> getFilmsList() {
        return filmsList;
    }

    public void setFilmsList(List<Films> filmsList) {
        this.filmsList = filmsList;
    }

    public List<Student> getStuds() {
        return studs;
    }

    public void setStuds(List<Student> studs) {
        this.studs = studs;
    }

    public List<Genre> getGenresList() {
        return genresList;
    }

    public void setGenresList(List<Genre> groupsList) {
        this.genresList = groupsList;
    }


    public List<Actors> getActorsList() {
        return actorsList;
    }

    public void setActorsList(List<Actors> actorsList) {
        this.actorsList = actorsList;
    }

    public List<Premiere> getPremiereList() {
        return premiereList;
    }

    public List<Hall> getHallList() {
        return hallList;
    }

    public void setHallList(List<Hall> hallList) {
        this.hallList = hallList;
    }

    public void setPremiereList(List<Premiere> premiereList) {
        this.premiereList = premiereList;
    }


}
