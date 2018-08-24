package com.interfaces;

import com.pojo.Student;

public interface StudentIO {
	Student[] readStudents();
	int writeStudents(Student[] student);

}
