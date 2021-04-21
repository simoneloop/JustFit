package justfit.justfit.entities;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="utente")
public class Utente {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    private int id;

    @Column(name="first_name",nullable = false)
    private String firstName;
}
