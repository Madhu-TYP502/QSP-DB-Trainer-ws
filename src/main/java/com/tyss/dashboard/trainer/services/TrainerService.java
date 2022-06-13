package com.tyss.dashboard.trainer.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tyss.dashboard.trainer.model.Student;

public interface TrainerService {
	
	public ResponseEntity<List<Student>> getAllStudents();
}
