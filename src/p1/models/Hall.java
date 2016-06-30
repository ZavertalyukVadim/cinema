package p1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name="hall")
public class Hall {
    @Id
    private int id;
    private String hallName;
    @OneToMany(mappedBy = "premiere")
    private List<Student> studList;

    public Hall(){

    }

    public Hall(String NameOfHalls) {
        this.hallName = NameOfHalls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }



    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }
}
