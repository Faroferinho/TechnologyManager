package com.example.JasonStatham.controllers;

import com.example.JasonStatham.objects.DataTransferObjects.TechnologyDTO;
import com.example.JasonStatham.objects.Technology;
import com.example.JasonStatham.services.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ThecnologyController {
    @Autowired
    private TechnologyService service;

    //TODO - Fazer o Mapeamento correto.
    //Create
    @PostMapping("")
    public ResponseEntity<Technology> create(@RequestBody TechnologyDTO dto){
        service.save(dto);

        Technology t = new Technology(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(t);
    }

    //TODO - Fazer o Mapeamento correto.
    //Read
    @GetMapping("")
    public ResponseEntity<List<Technology>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    //TODO - Fazer o Mapeamento correto.
    @GetMapping("")
    public ResponseEntity<Optional<Technology>> findById(@PathVariable("id") String id){
        return ResponseEntity.ok(service.findById(id));
    }

    //TODO - Fazer o Mapeamento correto.
    //Update
    @PutMapping("")
    public ResponseEntity<Technology> update(@RequestBody TechnologyDTO dto){
        Technology t = new Technology(dto);
        return ResponseEntity.ok(t);
    }

    //TODO - Fazer o Mapeamento correto.
    //Delete
    @DeleteMapping("")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
