package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List <StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		for(StudentModel a : studentList) {
			if(a.getNpm().equals(npm)) {
				return a;
			}
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudent(){
		return studentList;
	}
	
	@Override
	public void addStudent (StudentModel student) {
		studentList.add(student);
	}

	/*@Override
	public StudentModel deleteStudent(String npm) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	
	@Override
	public void deleteStudent(StudentModel student) {
		studentList.remove(student);
	}
	
}
