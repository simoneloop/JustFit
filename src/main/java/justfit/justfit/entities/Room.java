package justfit.justfit.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="spot_number",nullable = false)
    private int spotNumber;



}
