package com.zilker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zilker.bean.Student;
import com.zilker.constants.SQLConstants;
import com.zilker.utils.DBUtils;

public class StudentDAO {
	
	private static final Logger logger = Logger.getLogger(StudentDAO.class.getName());
	private Connection conn = null;
	private PreparedStatement pst = null;
	
	public int insertStudentDetails(Student student) {
		try {
			conn = DBUtils.getConnection();
			pst = conn.prepareStatement(SQLConstants.INSERT_STUDENT);
			pst.setString(1, student.getRegno());
			pst.setString(2, student.getFirstName());
			pst.setString(3, student.getLastName());
			pst.setString(4, student.getDeptName());
			pst.setString(5, student.getStatus());
			int count = pst.executeUpdate();
			return count;
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error inserting student details");
			return 0;
		}
	}

}
