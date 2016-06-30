package p1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name="url")
public class UrlOfFilm {
    @Id
    private int id;
    private  String urlOfImage;
    private String urlOfFilm;
    @OneToMany(mappedBy = "url")

    private List<Student> studList;

    public UrlOfFilm(){

    }

    public UrlOfFilm(String urlOfFilm) {
        this.urlOfFilm = urlOfFilm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUrlOfImage() {
        return urlOfImage;
    }

    public void setUrlOfImage(String urlOfImage) {
        this.urlOfImage = urlOfImage;
    }

    public void setUrlOfFilm(String urlOfFilm) {
        this.urlOfFilm = urlOfFilm;
    }


    public String getUrlOfFilm() {
        return urlOfFilm;
    }

    public void setNameOfFilm(String urlOfFilm) {
        this.urlOfFilm = urlOfFilm;
    }

    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }
}
