//package com.kadhy.MadrasatRegistration.api;
//
//import com.kadhy.MadrasatRegistration.modules.Subject;
//import com.kadhy.MadrasatRegistration.repositories.SubjectRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/subjects")
//public class SubjectAPI {
//    @Autowired
//    private SubjectRepo subjectRepo;
//
//    @PostMapping("")
//    public ResponseEntity<?> addSubjects(@RequestBody Subject sub){
//        try {
//            Subject subject = subjectRepo.save(sub);
//            return new ResponseEntity<>(subject, HttpStatus.OK);
//        }catch (Exception e){
//           return new ResponseEntity<>("Something went wrong!!", HttpStatus.CONFLICT);
//        }
//
//    }
//
//    @GetMapping("")
//    public ResponseEntity<?> getSubjects(){
//        try {
//            List<Subject> subject = subjectRepo.findAll();
//            return new ResponseEntity<>(subject, HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>("Subject Not Found", HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> updateSubject(@PathVariable Long id,@RequestBody Subject subject){
//        try {
//            if (subjectRepo.findById(id).isPresent()){
//                subject.setSubId(id);
//                Subject subj = subjectRepo.save(subject);
//                return new ResponseEntity<>(subj, HttpStatus.OK);
//            }else {
//                return new ResponseEntity<>("Subject Not Found!!!", HttpStatus.NOT_FOUND);
//            }
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong!!!!", HttpStatus.CONFLICT);
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getSubjectById(@PathVariable Long id){
//        try {
//            Optional<Subject> subje = subjectRepo.findById(id);
//            if (subje.isPresent()){
//                return new ResponseEntity<>(subje.get(), HttpStatus.OK);
//            }else {
//                return new ResponseEntity<>("Subject Not Found!!!", HttpStatus.NOT_FOUND);
//            }
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteSubject(@PathVariable Long id){
//        try {
//            subjectRepo.deleteById(id);
//            return new ResponseEntity<>("Subjet has bee Deleted!!!", HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>("Something went wrong", HttpStatus.CONFLICT);
//        }
//    }
//}
