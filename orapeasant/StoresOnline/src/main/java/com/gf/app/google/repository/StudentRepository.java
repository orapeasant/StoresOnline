package com.gf.app.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gf.app.google.model.Student;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Query("select s from Student s where s.userName = :userName")
	Student findByUserName(@Param("userName") String userName);
	
}
