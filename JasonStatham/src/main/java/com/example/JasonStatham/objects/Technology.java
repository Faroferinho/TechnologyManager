package com.example.JasonStatham.objects;

import com.example.JasonStatham.objects.DataTransferObjects.TechnologyDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Technology {

    private int id;
    private String description;

    public Technology(){

    }

    public Technology(int id, String description){
        this.id = id;
        this.description = description;
    }

    public Technology(TechnologyDTO dto){
        id = dto.getId();
        description = dto.getDescription();
    }
}
