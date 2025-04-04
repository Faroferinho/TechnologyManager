package com.example.JasonStatham.services;

import com.example.JasonStatham.objects.DataTransferObjects.TechnologyDTO;
import com.example.JasonStatham.objects.Technology;
import com.example.JasonStatham.repositories.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnologyService {
    @Autowired
    private TechnologyRepository repository;

    public Technology save(TechnologyDTO dto){
        Technology t = new Technology(dto);

        repository.save(t);

        return t;
    }

    public List<Technology> findAll(){
        return repository.findAll();
    }

    public Optional<Technology> findById(String id){
        return repository.findById(id);
    }

    public void deleteById(String id){
        repository.deleteById(id);
    }
}
