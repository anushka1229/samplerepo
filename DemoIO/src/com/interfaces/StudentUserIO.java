package com.interfaces;

import com.pojo.Student;

public interface StudentUserIO {
    Student[] readFromUser();
    void writeToUser(Student[] students);
}
