package myjava.servlets;

import myjava.JdbcUtil;
import myjava.tables.Homework;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HomeworkD {
    //增加
    public void add(Homework homework){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("insert into homework(hname,hbegintime,hendtime,tname,hsubmitnum) values(?,?,?,?,?)");
            pstmt.setString(1,homework.getHname());
            pstmt.setDate(2,homework.getHbegintime());
            pstmt.setDate(3,homework.getHendtime());
            pstmt.setString(4,homework.getTname());
            pstmt.setInt(5,homework.getHsubmitnum());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //删除
    public void delete(Homework homework){
        try {
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from homework where hname = ?");
            pstmt.setString(1,homework.getHname());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt, conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //查找
    public List<Homework> findAll(){
        List<Homework> list = new ArrayList<Homework>();
        try{
            System.out.println("t1");
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from homework");
            ResultSet rs = pstmt.executeQuery();
            System.out.println("t2");
            while(rs.next()){
            Homework homework = new Homework();
            homework.setHname(rs.getString(1));
            homework.setHbegintime(rs.getDate(2));
            homework.setHendtime(rs.getDate(3));
            homework.setTname(rs.getString(4));
            homework.setHsubmitnum(rs.getInt(5));
            list.add(homework);
            }
            System.out.println("t3");
            JdbcUtil.close(pstmt, conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;

    }

}
