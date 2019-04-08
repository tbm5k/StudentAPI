package com.tbm5k.StudentAPI.com.tbm5k.StudentAPI.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public void addStudent(Student student) {
       // listOfStudents.add(student);

        studentRepository.save(student);
    }


    public Student getStudent(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents (){
        //return students;

        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void updateStudent(String id, Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
