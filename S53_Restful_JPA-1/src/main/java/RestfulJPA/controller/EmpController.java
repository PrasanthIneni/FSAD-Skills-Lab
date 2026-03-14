package RestfulJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import RestfulJPA.model.Employee;
import RestfulJPA.repository.EmpRepository;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpRepository empRepository;

    // CREATE
    @PostMapping("/save")
    public ResponseEntity<String> addEmployee(@RequestBody Employee e) {
        empRepository.save(e);  
        return ResponseEntity.ok("Data saved successfully");
    }

    // READ BY ID
    @GetMapping("/{eid}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int eid) {

        Optional<Employee> e = empRepository.findById(eid);

        if (e.isPresent()) {
            return ResponseEntity.ok(e.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // READ ALL
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    // DELETE
    @DeleteMapping("/{eid}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int eid) {

        if (empRepository.existsById(eid)) {
            empRepository.deleteById(eid);
            return ResponseEntity.ok("Record deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}