package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;
    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable("id") long id) {
        return studentRepository.findById(id).orElse(new Student());
    }

    @GetMapping("/students")
    public List<Student> findStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public StudentResponseDto post(@RequestBody StudentDto studentDto) {
        return toStudentResponseDto(
                studentRepository.save(
                        toStudent(studentDto)
                )
        );
    }

    private Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());

        student.setSchool(school);

        return student;
    }

    private StudentResponseDto toStudentResponseDto(Student student) {
        return new StudentResponseDto(student.getFirstName(), student.getLastName(), student.getEmail());
    }

    @GetMapping("/students/search/{name}")
    public List<Student> findStudentById(@PathVariable("name") String name) {
        return studentRepository.findAllByFirstNameContaining(name);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }
}
