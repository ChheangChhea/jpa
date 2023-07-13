package co.istad.sb5datajpa;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//   @ToString.Exclude
//    @JsonBackReference
//    @ManyToMany (mappedBy = "roles")
//    private List<User> users;

//    @OneToOne
//    private User user;

}
