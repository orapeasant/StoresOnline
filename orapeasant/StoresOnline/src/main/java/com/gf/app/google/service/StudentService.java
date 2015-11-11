package com.gf.app.google.service;

import com.gf.app.google.model.Student;

public interface StudentService {
	Student save(Student student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
