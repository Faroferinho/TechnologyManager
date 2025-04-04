package com.example.JasonStatham.repositories;

import com.example.JasonStatham.objects.Technology;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends MongoRepository<Technology, String> {
}
