package com.kadhy.MadrasatRegistration.api;

import com.kadhy.MadrasatRegistration.modules.UserCredintial;
import com.kadhy.MadrasatRegistration.repositories.UserCredintialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/users")
public class UserAPI {
    @Autowired
    private UserCredintialRepo userCredintialRepo;

    @PostMapping("")
    public ResponseEntity<?> addUsers(@RequestBody UserCredintial userCredintial){
        try {
            UserCredintial users = userCredintialRepo.save(userCredintial);
            return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong!!", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getUsers(){
        try {
            List<UserCredintial> usa = userCredintialRepo.findAll();
            return new ResponseEntity<>(usa, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUsers(@PathVariable Long id,@RequestBody UserCredintial userCredintial){
        try {
            if (userCredintialRepo.findById(id).isPresent()){
                userCredintial.setUserId(id);
                UserCredintial uses = userCredintialRepo.save(userCredintial);
                return new ResponseEntity<>(uses, HttpStatus.OK);
            }else {
                return new ResponseEntity<>("User Not Found!!!", HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong!!!!", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUsersById(@PathVariable Long id){
        try {
            Optional<UserCredintial> usas = userCredintialRepo.findById(id);
            if (usas.isPresent()){
                return new ResponseEntity<>(usas.get(), HttpStatus.OK);
            }else {
                return new ResponseEntity<>("User Not Found!!!", HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUsers(@PathVariable Long id){
        try {
            userCredintialRepo.deleteById(id);
            return new ResponseEntity<>("Status has bee Deleted!!!", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
        }
    }
}
