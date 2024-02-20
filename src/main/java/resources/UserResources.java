package resources;

import entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll() {
        try {
            // Simulando busca de usuários no banco de dados
            User u = new User(1L, "Maria", "Maria@gmail.com", "99999999", null);
            return ResponseEntity.ok().body(u);
        } catch (Exception e) {
            // Captura de exceção e retorno de status de erro apropriado
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
