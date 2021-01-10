package day9.myExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Student;
import utility.DBUtil;

public class StudentDAO {

public void getAllStudent() {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="select * from student";
		
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String course=rs.getString(3);
				int duration=rs.getInt(4);
				int age=rs.getInt(5);
				System.out.println("Student Id:"+id);
				System.out.println("Student Name:"+name);
				System.out.println("Course:"+course);
				System.out.println("Duration:"+duration);
				System.out.println("Age:"+age);
				System.out.println("**************");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getStudent(int rollNum) {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="select * from student where roll_number=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, rollNum);
			ResultSet rs= pst.executeQuery();
			if (rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String course=rs.getString(3);
				int duration=rs.getInt(4);
				int age=rs.getInt(5);
				System.out.println("Student Id:"+id);
				System.out.println("Student Name:"+name);
				System.out.println("Course:"+course);
				System.out.println("Duration:"+duration);
				System.out.println("Age:"+age);
			} else {
				System.out.println("Student not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent(int rollNum) {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="delete from student where roll_number=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, rollNum);
			int result=pst.executeUpdate();
			if (result==0) {
				System.out.println("Deletion failed");
			} else {
				System.out.println("Deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateStudent(Student student) {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="update student set student_name=?,course=?,duration=?,age=? where roll_number=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, student.getName());
			pst.setString(2, student.getCourse());
			pst.setInt(3, student.getDuration());
			pst.setInt(4, student.getAge());
			pst.setInt(5, student.getRollNum());
			int result=pst.executeUpdate();
			if (result==0) {
				System.out.println("Updation failed");
			} else {
				System.out.println("Updated!!!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
