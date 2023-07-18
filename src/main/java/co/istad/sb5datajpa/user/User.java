package co.istad.sb5datajpa.user;

import co.istad.sb5datajpa.role.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

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


    private UUID uuid;


    private String email;

    private String phone;

    @Column(name = "is_deleted")
    private Boolean isDeleted;


    @Column(unique = true, nullable = false, length = 50)
    private String username;


    @Column(name = "display_name", length = 50)
    private String displayName;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL UNIQUE")
    private String biography;

    private Boolean isdeleted;

  //  @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_registration",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id") )
    private List <Role> roles;


}