package backend_sei.spring.core.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public ResponseEntity<String> welcomeMessage(){
        return ResponseEntity.ok("Silahkan menggunakan endpoint \"/api/{lokasi atau proyek}\"");
    }
}
