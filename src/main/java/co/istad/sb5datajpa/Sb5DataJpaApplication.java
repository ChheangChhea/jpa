package co.istad.sb5datajpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;




@SpringBootApplication
@RequiredArgsConstructor
public class Sb5DataJpaApplication {
private final RoleRepository roleRepository;
private final UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(Sb5DataJpaApplication.class, args);
    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Role admin = Role.builder()
//                .name("ADMIN")
//                .build();
//
//        roleRepository.save(admin);
//
//        User user1 = User.builder()
//                .username("Chheangchhea")
//                .displayName("chhea")
//                .roles(List.of(admin))
//                .build();
//        userRepository.save(user1);
//
//        User user2 = User.builder()
//                .username("Chheangchhea")
//                .displayName("chhea")
//                .roles(List.of(admin))
//                .build();
//        userRepository.save(user2);
//
//        User user3 = User.builder()
//                .username("Chheangchhea")
//                .displayName("chhea")
//                .roles(List.of(admin))
//                .build();
//         userRepository.save(user3);
//    }
}
