package co.istad.sb5datajpa;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "name", length = 50)
    private String displayName;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL UNIQUE")
    private String biography;


//    @ToString.Exclude
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "users_registration",
//            joinColumns=@JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id") )
//    private List <Role> roles;

    @OneToOne

    private Role role;



}