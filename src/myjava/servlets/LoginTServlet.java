package myjava.servlets;


import myjava.tables.Teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginTServlet")
public class LoginTServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginServlet...doPost...");
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        TeacherD td=new TeacherD();
        Teacher t=td.search(username);
        if(t.getTpassword()==password){
            System.out.println("yes");
            request.setAttribute( "logintresult ","yes");
        }else{
            System.out.println("no");
            request.setAttribute( "logintresult ","no");
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+request.getParameter("logintresult"));
        request.getRequestDispatcher( "index.jsp").forward(request,response);
    }

}
