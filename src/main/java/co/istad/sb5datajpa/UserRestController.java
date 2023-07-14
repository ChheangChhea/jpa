package co.istad.sb5datajpa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserRestController {
    private final UserRepository userRepository;
    @GetMapping
    public Iterable<User>findAll(){
        return userRepository.findAll();
    }
}
