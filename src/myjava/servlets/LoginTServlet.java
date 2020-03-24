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
        String username = request.getParameter("tusername");
        String password = request.getParameter("tpassword");
        TeacherD td=new TeacherD();
        Teacher t=td.search(username);
        System.out.println(username+"$search$"+t.getTpassword());
        System.out.println(username+"$get$"+password);
        System.out.println("t.getTpassword().equals(password):"+t.getTpassword().equals(password));
        if(t.getTpassword().equals(password)){
            System.out.println("yes");
            request.setAttribute( "tusername ",username);
            request.getRequestDispatcher( "/teacher.jsp?tname="+username).forward(request,response);
        }else{
            System.out.println("no");
            request.getRequestDispatcher( "/failed.jsp").forward(request,response);
        }

    }

}
