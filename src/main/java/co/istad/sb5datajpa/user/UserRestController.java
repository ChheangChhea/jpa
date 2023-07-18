package co.istad.sb5datajpa.user;

import co.istad.sb5datajpa.user.User;
import co.istad.sb5datajpa.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserRestController {
    private final UserRepository userRepository;
    @GetMapping
    public Iterable<User>findAll(@RequestParam(required = false, name ="displayName" ) String displayName){
        if(displayName == null ){
            return userRepository.findAll();
        }else {
            return userRepository.searchByDisplayNameContainingIgnoreCase(displayName);
        }


    }
    @GetMapping("/{username}")
    public User findByUsername(@RequestParam String username){


           return userRepository.findByUsernameAndIsDeletedFalse(username).orElseThrow();


    }


}
