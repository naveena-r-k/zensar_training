package day9.myExample;

import beans.Student;
import utility.DBUtil;
import java.sql.*;

public class TestDbStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student student1= new Student(47001, "Anna", "BE", 4, 21);
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="insert into student values(?,?,?,?,?)";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1,student1.getRollNum());
			pst.setString(2, student1.getName());
			pst.setString(3,student1.getCourse());
			pst.setInt(4, student1.getDuration());
			pst.setInt(5, student1.getAge());
			
			int resultSet=pst.executeUpdate();
			if (resultSet==0) {
				System.out.println("Query Insertion failed");
			} else {
				System.out.println("Success!!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		StudentDAO ts= new StudentDAO();
		//ts.getAllStudent();
		//ts.getStudent(47001);
		//ts.getStudent("julie");
		ts.deleteStudent(47001);
		
		Student student= new Student(47002, "Mel", "Pharmacy",3, 32);
		ts.updateStudent(student);
	}

		
}
