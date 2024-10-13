package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentProfile {
    @Id
    @GeneratedValue
    private long id;
    private String bio;
    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    private Student student;
    public StudentProfile(String bio) {
        this.bio = bio;
    }
}
