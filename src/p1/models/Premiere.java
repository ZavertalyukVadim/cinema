package p1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name="aboutfilm")
public class Premiere {
    @Id
    private int id;
    private String nameOfVariant;
    @OneToMany(mappedBy = "premiere")
    private List<Student> studList;

    public Premiere(){

    }

    public Premiere(String nameOfVariant) {
        this.nameOfVariant = nameOfVariant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNameOfVariant() {
        return nameOfVariant;
    }

    public void setNameOfVariant(String nameOfVariant) {
        this.nameOfVariant = nameOfVariant;
    }

    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }
}
