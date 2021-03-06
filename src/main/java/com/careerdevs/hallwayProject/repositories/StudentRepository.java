package com.careerdevs.hallwayProject.repositories;

import com.careerdevs.hallwayProject.models.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByCohort(Integer cohort, Sort sort);
}
