package co.istad.sb5datajpa.role;

import co.istad.sb5datajpa.role.Role;
import co.istad.sb5datajpa.role.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/roles")
public class RoleRestController {
    private final RoleRepository roleRepository;
    @GetMapping
    public Iterable<Role>findAll(){
        return roleRepository.findAll();
    }


   @GetMapping("/name")
    public Role findByName(@PathVariable String name){
        return roleRepository.findByName(name).orElseThrow();
   }



}
