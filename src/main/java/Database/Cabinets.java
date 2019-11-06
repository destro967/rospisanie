package Database;

import javax.persistence.*;

@Entity
@Table(name="cabinets")
public class Cabinets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String free;


}
