package myjava.servlets;


import myjava.tables.Student;
import myjava.tables.Submit;
import myjava.tables.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");
        String hname = request.getSession().getAttribute("hname").toString();
        String sname = request.getSession().getAttribute("sname").toString();
        SubmitD td=new SubmitD();
        Submit t=new Submit(hname,sname,text);
        td.add(t);
        request.getRequestDispatcher( "/submitsuccess.jsp").forward(request,response);
    }

}
