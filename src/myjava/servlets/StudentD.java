package myjava.servlets;

import myjava.JdbcUtil;
import myjava.tables.Student;
import myjava.tables.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentD {

    //增加
    public void add(Student student){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("insert into student(sname,susername,spassword) values(?,?,?)");
            pstmt.setString(1,student.getSname());
            pstmt.setString(2,student.getSusername());
            pstmt.setString(3,student.getSpassword());

            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删除
    public void delete(Student student){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from student where sname = ?");
            pstmt.setString(1,student.getSname());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //查找
    public List<Student> findAll(){
        List<Student> list = new ArrayList<Student>();
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from student");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setSname(rs.getString(1));
                student.setSusername(rs.getString(2));
                student.setSpassword(rs.getString(3));

                list.add(student);
            }
            JdbcUtil.close(pstmt, conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;

    }
    //查找
    public Student search(String susername){
        Student students = new Student();
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select susername,spasssword from student where sname = ?");
            pstmt.setString(1,susername);
            ResultSet rs = pstmt.executeQuery();

            students.setSusername(rs.getString(1));
            students.setSpassword(rs.getString(2));

            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return students;
    }

}
