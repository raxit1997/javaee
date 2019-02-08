package com.zilker.delegates;

import com.zilker.bean.Student;
import com.zilker.dao.StudentDAO;

public class StudentDelegate {
	
	public boolean insertStudent(Student student) {
		try {
			if (student.getYear() > 2018) {
				student.setStatus("ALUMNI");
			} else {
				student.setStatus("CURRENT");
			}
			StudentDAO studentDAO = new StudentDAO();
			int count = studentDAO.insertStudentDetails(student);
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
