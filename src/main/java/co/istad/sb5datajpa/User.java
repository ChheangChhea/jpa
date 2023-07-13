package co.istad.sb5datajpa;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "name", length = 50)
    private String displayName;

    @Column(nullable = false)
    private String biography;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}