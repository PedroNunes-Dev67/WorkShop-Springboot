package ProjetoNelio.resources;

import ProjetoNelio.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User user = new User(1L,"Pedro","pedro@gmail.com","81991024299","12345");
        return ResponseEntity.ok().body(user);
    }
}
