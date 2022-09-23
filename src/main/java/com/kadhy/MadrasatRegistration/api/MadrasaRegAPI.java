package com.kadhy.MadrasatRegistration.api;

import com.kadhy.MadrasatRegistration.modules.MadrasaReg;
import com.kadhy.MadrasatRegistration.repositories.MadrasaRegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/registration")

public class MadrasaRegAPI {
    @Autowired
    private MadrasaRegRepo madrasaRegRepo;

    @PostMapping("")
    public ResponseEntity<?> addRegister(@RequestBody MadrasaReg reg){
        try {
            MadrasaReg madrasa = madrasaRegRepo.save(reg);
            return new ResponseEntity<>(madrasa, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong!!", HttpStatus.CONFLICT);
        }

    }

    @GetMapping("")
    public ResponseEntity<?> getRegister(){
        try {
            List<MadrasaReg> madsa = madrasaRegRepo.findAll();
            return new ResponseEntity<>(madsa, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Madrasa Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRegister(@PathVariable Long id,@RequestBody MadrasaReg mad){
        try {
            if (madrasaRegRepo.findById(id).isPresent()){
                mad.setMadId(id);
                MadrasaReg regis = madrasaRegRepo.save(mad);
                return new ResponseEntity<>(regis, HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Madrasat Not Found!!!", HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong!!!!", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMadrasaById(@PathVariable Long id){
        try {
            Optional<MadrasaReg> madreg = madrasaRegRepo.findById(id);
            if (madreg.isPresent()){
                return new ResponseEntity<>(madreg.get(), HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Madrasat Not Found!!!", HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRegister(@PathVariable Long id){
        try {
            madrasaRegRepo.deleteById(id);
            return new ResponseEntity<>("Madrasat has bee Deleted!!!", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
        }
    }
}
