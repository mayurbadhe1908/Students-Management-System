package com.Management.StudentsManagementSystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Management.StudentsManagementSystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
