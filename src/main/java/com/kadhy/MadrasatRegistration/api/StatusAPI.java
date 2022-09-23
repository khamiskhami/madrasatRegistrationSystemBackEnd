package com.kadhy.MadrasatRegistration.api;
import com.kadhy.MadrasatRegistration.modules.Status;
import com.kadhy.MadrasatRegistration.repositories.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/status")
public class StatusAPI {
    @Autowired
    private StatusRepo statusRepo;

    @PostMapping("")
    public ResponseEntity<?> addStatus(@RequestBody Status status){
        try {
            Status st = statusRepo.save(status);
            return new ResponseEntity<>(st, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong!!", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getStatus(){
        try {
            List<Status> stat = statusRepo.findAll();
            return new ResponseEntity<>(stat, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Subject Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable Long id,@RequestBody Status status){
        try {
            if (statusRepo.findById(id).isPresent()){
                status.setStsId(id);
                Status start = statusRepo.save(status);
                return new ResponseEntity<>(start, HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Status Not Found!!!", HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong!!!!", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStatusById(@PathVariable Long id){
        try {
            Optional<Status> start = statusRepo.findById(id);
            if (start.isPresent()){
                return new ResponseEntity<>(start.get(), HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Status Not Found!!!", HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStatus(@PathVariable Long id){
        try {
            statusRepo.deleteById(id);
            return new ResponseEntity<>("Status has bee Deleted!!!", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
        }
    }
}
