package com.devsuperior.hrworker.resources;

import java.util.List;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> buscarTodos(){
        List<Worker> workers = workerRepository.findAll();
        return ResponseEntity.ok(workers);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> buscarPorId(@PathVariable Long id){
        Worker workers = workerRepository.findById(id).get();
        return ResponseEntity.ok(workers);
    }

}
