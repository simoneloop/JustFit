package justfit.justfit.entities;


import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="city",nullable = false)
    private String city;

    @Column(name="address",nullable = false)
    private String address;

    /*@Column(name="roomList",nullable = false)
    private List<Room> rooms;*/

}
