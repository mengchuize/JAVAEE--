package myjava.servlets;


import myjava.JdbcUtil;

import myjava.tables.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherD {
    //增加
    public void add(Teacher teacher){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("insert into teacher(tname,tusername,tpassword) values(?,?,?)");
            pstmt.setString(1,teacher.getTname());
            pstmt.setString(2,teacher.getTusername());
            pstmt.setString(3,teacher.getTpassword());

            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删除
    public void delete(Teacher teacher){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from teacher where tname = ?");
            pstmt.setString(1,teacher.getTname());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //查找
    public List<Teacher> findAll(){
        List<Teacher> list = new ArrayList<Teacher>();
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from teacher");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Teacher teacher = new Teacher();
                teacher.setTname(rs.getString(1));
                teacher.setTusername(rs.getString(2));
                teacher.setTpassword(rs.getString(3));

                list.add(teacher);
            }
            JdbcUtil.close(pstmt, conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;

    }
    //查找
    public Teacher search(String tusername){
        Teacher teachers = new Teacher();
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from teacher where tname = ?");
            pstmt.setString(1,tusername);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                teachers.setTname(rs.getString(1));
                teachers.setTusername(rs.getString(2));
                teachers.setTpassword(rs.getString(3));
            }
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return teachers;
    }
}