package myjava.servlets;

import myjava.JdbcUtil;
import myjava.tables.Student;
import myjava.tables.Submit;
import myjava.tables.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubmitD {
    //增加
    public void add(Submit submit){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("insert into submit(hname,sname,shis) values(?,?,?)");
            pstmt.setString(1,submit.getHname());
            pstmt.setString(2,submit.getSname());
            pstmt.setString(3,submit.getShis());

            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删除
    public void delete(Submit submit){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from submit where hname = ? and sname = ?");
            pstmt.setString(1,submit.getHname());
            pstmt.setString(2,submit.getSname());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //查找
    public List<Submit> findAll(){
        List<Submit> list = new ArrayList<Submit>();
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from submit");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Submit submit = new Submit();
                submit.setHname(rs.getString(1));
                submit.setSname(rs.getString(2));
                submit.setShis(rs.getString(3));

                list.add(submit);
            }
            JdbcUtil.close(pstmt, conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;

    }
    //查找
    public List<Submit> search(String hname){
        List<Submit> submits = new ArrayList<Submit>();
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from submit where hname = ?");
            pstmt.setString(1,hname);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                Submit ss=new Submit(rs.getString(1),rs.getString(2),rs.getString(3));
                submits.add(ss);
            }

            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return submits;
    }

}
