package Database.Models;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private Groups group;

    public Students(long id, Groups group) {
        this.id = id;
        this.group = group;
    }

    public Students(Groups group) {
        this.group = group;
    }

    public Students() {
    }

    public long getId() {
        return id;
    }

    public Groups getGroup() {
        return group;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }
}
