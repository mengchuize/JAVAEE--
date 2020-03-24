package myjava.servlets;

import myjava.tables.Homework;
import myjava.tables.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String sname = request.getParameter("sname");
        String susername = request.getParameter("susername");
        String spassword = request.getParameter("spassword");

        StudentD td=new StudentD();
        Student t=new Student(sname,susername,spassword);
        td.add(t);
        request.getRequestDispatcher( "/submitsuccess.jsp").forward(request,response);
    }

}
