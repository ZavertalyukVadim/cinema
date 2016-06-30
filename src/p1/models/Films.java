package p1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name="films")
public class Films {
    @Id
    private int id;
    private String nameOfFilm;
    @OneToMany(mappedBy = "films")
    private List<Student> studList;

    public Films(){

    }

    public Films(String nameOfFilm) {
        this.nameOfFilm = nameOfFilm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNameOfFilm() {
        return nameOfFilm;
    }

    public void setNameOfFilm(String nameOfFilm) {
        this.nameOfFilm = nameOfFilm;
    }

    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }
}
