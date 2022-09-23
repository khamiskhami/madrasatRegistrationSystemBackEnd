//package com.kadhy.MadrasatRegistration.api;
//
//import com.kadhy.MadrasatRegistration.modules.MadReport;
//import com.kadhy.MadrasatRegistration.repositories.MadRepotRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@CrossOrigin(allowedHeaders = "*", origins = "*")
//@RequestMapping("/report")
//public class MadReportAPI {
//    @Autowired
//    private MadRepotRepo madRepotRepo;
//
//    @PostMapping("")
//    public ResponseEntity<?> addReport(@RequestBody MadReport madReport){
//        try {
//            MadReport rasat = madRepotRepo.save(madReport);
//            return new ResponseEntity<>(rasat, HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong!!", HttpStatus.CONFLICT);
//        }
//    }
//
//    @GetMapping("")
//    public ResponseEntity<?> getReport(){
//        try {
//            List<MadReport> madras = madRepotRepo.findAll();
//            return new ResponseEntity<>(madras, HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>("Madrasat Not Found", HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> updateMadrasa(@PathVariable Long id,@RequestBody MadReport madReport){
//        try {
//            if (madRepotRepo.findById(id).isPresent()){
//                madReport.setRepotId(id);
//                MadReport rasaty = madRepotRepo.save(madReport);
//                return new ResponseEntity<>(rasaty, HttpStatus.OK);
//            }else {
//                return new ResponseEntity<>("Madrasat Not Found!!!", HttpStatus.NOT_FOUND);
//            }
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong!!!!", HttpStatus.CONFLICT);
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getMadrasaById(@PathVariable Long id){
//        try {
//            Optional<MadReport> mad = madRepotRepo.findById(id);
//            if (mad.isPresent()){
//                return new ResponseEntity<>(mad.get(), HttpStatus.OK);
//            }else {
//                return new ResponseEntity<>("Madrasat Not Found!!!", HttpStatus.NOT_FOUND);
//            }
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteMadrasa(@PathVariable Long id){
//        try {
//            madRepotRepo.deleteById(id);
//            return new ResponseEntity<>("Madrasat has bee Deleted!!!", HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
//        }
//    }
//}
