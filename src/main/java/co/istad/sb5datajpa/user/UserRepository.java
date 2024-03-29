package co.istad.sb5datajpa.user;

import co.istad.sb5datajpa.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends CrudRepository <User,Integer> {


    Optional<User> findByUsernameAndIsDeletedFalse(String username);

    List<User> searchByDisplayNameContainingIgnoreCase(String displayName);

}
