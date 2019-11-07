package Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Facultets")
public class Facultets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private List<Groups> groups ;

    public Facultets(long id) {
        this.id = id;
    }

    public Facultets() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
