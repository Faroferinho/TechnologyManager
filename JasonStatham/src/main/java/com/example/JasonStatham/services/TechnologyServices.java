package com.example.JasonStatham.services;

import com.example.JasonStatham.repositories.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyServices {
    @Autowired
    private TechnologyRepository repository;


}
