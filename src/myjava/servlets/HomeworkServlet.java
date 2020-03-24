package myjava.servlets;

import myjava.tables.Homework;
import myjava.tables.Submit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;


@WebServlet("/HomeworkServlet")
public class HomeworkServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String hname = request.getParameter("hname");
        java.sql.Date btime = new java.sql.Date(System.currentTimeMillis());
        System.out.println("request.getParameter(hname):"+request.getParameter("hname"));
        System.out.println("request.getParameter(edate):"+request.getParameter("edate"));
        System.out.println("request.getSession().getAttribute(tname):"+request.getSession().getAttribute("tname"));
        java.sql.Date edate=strToDate(request.getParameter("edate"));

        HomeworkD td=new HomeworkD();
        Homework t=new Homework(hname,btime,edate,request.getSession().getAttribute("tname").toString(),0);
        td.add(t);
        request.getRequestDispatcher( "/submitsuccess.jsp").forward(request,response);
    }
    public static java.sql.Date strToDate(String strDate) {
        String str = strDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }

}
