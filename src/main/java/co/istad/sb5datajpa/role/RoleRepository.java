package co.istad.sb5datajpa.role;


import co.istad.sb5datajpa.role.Role;
import co.istad.sb5datajpa.user.User;
import org.springframework.data.repository.CrudRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role,Integer> {

//    List<User>findByUsernameAndIs
    Optional<Role> findByName(String name);
}
