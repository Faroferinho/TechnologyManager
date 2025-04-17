package com.example.JasonStatham.controllers;

import com.example.JasonStatham.Constants;
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
public class TechnologyController {
    @Autowired
    private TechnologyService service;

    //Create
    @PostMapping(Constants.API_TECH)
    public ResponseEntity<Technology> create(@RequestBody TechnologyDTO dto){
        service.save(dto);

        Technology t = new Technology(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(t);
    }

    //Read
    @GetMapping(Constants.API_TECH)
    public ResponseEntity<List<Technology>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(Constants.API_TECH + "/{id}")
    public ResponseEntity<Optional<Technology>> findById(@PathVariable("id") String id){
        return ResponseEntity.ok(service.findById(id));
    }

    //Update
    @PutMapping(Constants.API_TECH)
    public ResponseEntity<Technology> update(@RequestBody TechnologyDTO dto){
        Technology t = new Technology(dto);
        return ResponseEntity.ok(t);
    }

    //Delete
    @DeleteMapping(Constants.API_TECH + "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
