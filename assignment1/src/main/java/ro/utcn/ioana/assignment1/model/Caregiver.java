package ro.utcn.ioana.assignment1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Caregiver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String name;
    private String birthdate;
   private String gender;
   private String address;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn
   private List<Patient> patients;


}