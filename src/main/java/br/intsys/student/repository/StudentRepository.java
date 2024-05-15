package br.intsys.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.intsys.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}