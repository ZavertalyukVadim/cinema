package p1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name="actors")
public class Actors {
    @Id
    private int id;

    private String nameOfActors;
    @OneToMany(mappedBy = "actors")
    private List<Student> studList;

    public Actors(){

    }

    public Actors(String nameOfActors) {
        this.nameOfActors = nameOfActors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNameOfActors() {
        return nameOfActors;
    }

    public void setNameOfActors(String nameOfActors) {
        this.nameOfActors = nameOfActors;
    }

    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }
}
