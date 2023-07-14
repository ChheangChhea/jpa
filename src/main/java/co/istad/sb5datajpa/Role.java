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
    private Integer id;

    private String name;

   @ToString.Exclude
    @JsonBackReference
    @ManyToMany (mappedBy = "roles")
//   @JoinTable(name = "users_registration",
//           joinColumns=@JoinColumn(name = "role_id"),
//           inverseJoinColumns = @JoinColumn(name = "user_id") )
    private List<User> users;


}
