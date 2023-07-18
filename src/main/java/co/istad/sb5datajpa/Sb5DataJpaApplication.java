package co.istad.sb5datajpa;

import co.istad.sb5datajpa.role.Role;
import co.istad.sb5datajpa.role.RoleRepository;
import co.istad.sb5datajpa.user.User;
import co.istad.sb5datajpa.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;




@SpringBootApplication
@RequiredArgsConstructor
public class Sb5DataJpaApplication implements CommandLineRunner {
private final RoleRepository roleRepository;
private final UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(Sb5DataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Role admin= Role.builder()
                .name("ADMIN")
                .build();

        Role editor= Role.builder()
                .name("EDITOR")
                .build();

        Role subscriber = Role.builder()
                .name("SUBSCRIBER")
                .build();

        roleRepository.save(admin);
        roleRepository.save(editor);
        roleRepository.save(subscriber);


        User user= User.builder()
                .isdeleted(false)
                .username("Chheangchhea")
                .displayName("Chheang Chhea")
                .biography("Hello yy")
                .roles(List.of(admin))
                .build();
        userRepository.save(user);

        User user2= User.builder()

                .username("Chhea")
                .displayName("Chhea")
                .biography("Hello every ")
                .isdeleted(true)
                .roles(List.of(subscriber))
                .build();
        userRepository.save(user2);

        User user3= User.builder()

                .username("Dara")
                .displayName("Chhea")
                .isdeleted(false)
                .biography("Hello every today ")
                .roles(List.of(admin,editor))
                .build();
        userRepository.save(user3);

       Iterable <User> users=userRepository.findAll();
      users.forEach(u-> {
          System.out.println(u.getUsername());
          System.out.println(u.getRoles().get(0).getName());
      });


    }
}
