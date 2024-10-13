package com.example.demo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(
            mappedBy = "school"
    )
    @JsonManagedReference
    private List<Student> students;
    public School(String name) {
        this.name = name;
    }
}
