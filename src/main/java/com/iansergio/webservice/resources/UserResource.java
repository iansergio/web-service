package com.iansergio.webservice.resources;

import com.iansergio.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getAll(){
        User u = new User(1L, "joao", "joao@gmail.com", "000000000", "123");
        return ResponseEntity.ok().body(u);
    }
}
